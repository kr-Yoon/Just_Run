package JustRunJava;

public class Code175 {
    	// best product select
	@Override
	public Map<String, Map<String, Object>> bestProductList() throws Exception {

		// 베스트 상품 리스트 대입
		List<ProductVO> bestProducts = productDAO.selectBestProduct();
		
		
		// 메인화면에 호출할 세개의 상품정보 + 이미지를 담을 객체 생성 (mainProduct 1~3)
		Map<String, Map<String, Object>> bestProductInfo = new HashMap<String, Map<String, Object>>();
		// 이미지 호출을 위한 option Map 객체 생성
		Map<String, String> option = new HashMap<String, String>();
			
		if(bestProducts != null && !bestProducts.isEmpty() ) {
		for (int i = 0; i < bestProducts.size(); i++) {

			ProductVO product = bestProducts.get(i);
			
			if (product != null) {
				
				String match_id = product.getProduct_id();
				String image_category = "main";
				
				option.put("match_id", match_id);
				option.put("image_category", image_category);

				// 해당 상품과 연관된 메인 이미지 호출
				ImageVO productImage = imageService.selectProductImage(option);
				// byte를 img로 변환하기 위한 encode
				
				// 상품 내용과 이미지를 담을 객체 생성
				Map<String, Object> productInfo = new HashMap<String, Object>();
				
				// byte[] 자료를 img 태그에 사용가능하도록 encode
				String encodeImage = Base64.getEncoder().encodeToString(productImage.getImage_file());
				
				productInfo.put("product_main_title", product.getProduct_main_title());
				productInfo.put("product_sub_title", product.getProduct_sub_title());
				productInfo.put("product_price", product.getProduct_price());
				productInfo.put("product_discount", product.getProduct_discount());
				productInfo.put("image_file", encodeImage);
				productInfo.put("product_id", product.getProduct_id());

				bestProductInfo.put("product" + (i+1), productInfo);
				
			}

		}
		}

		return bestProductInfo;

	}
}
