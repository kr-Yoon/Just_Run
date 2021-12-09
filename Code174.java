package JustRunJava;

public class Code174 {

    // Controller에 위치
    @Override
	public void ImageSetImageVO(MultipartHttpServletRequest multipartRequest, String match_id) throws Exception {
		
		//파라미터로 들어오는 match_id는 notice_id / product_id가 되어야함.

		// multipart로 전달된 첨부파일의 name 속성값 전체 대입
		Iterator<String> imageFileNames = multipartRequest.getFileNames();
		
		// 값이 있는지 확인 후 while 조건문 반복
		while (imageFileNames.hasNext()) {	
			// 해당 반복문의 name(product의 경우 body, main, sub) 대입
			String imageCategory =  imageFileNames.next();
			// imageFile 객체에 file객체의 전체 정보를 대입
			MultipartFile imageFile = multipartRequest.getFile(imageCategory);
			if (imageFile != null) {
				if (imageFile.getOriginalFilename() != null && imageFile.getOriginalFilename() != "") {
				imageVO.setImage_match_id(match_id);
				imageVO.setImage_category(imageCategory);
				imageVO.setImage_file_name(imageFile.getOriginalFilename());
				imageVO.setImage_file(imageFile.getBytes());

				// 대입된 자료를 mapper.image.insertImage 로 전송
				String imageName = imageService.addImageFile(imageVO);

				System.out.printf("[%s] 이미지 파일이 DataBase에 저장되었습니다.%n", imageName);
				}
			}
		}

	}
}

public class ImageServiceImpl implements ImageService {
	
	@Autowired
	private ImageDAO imageDAO;

	public String addImageFile(ImageVO imageVO) throws Exception {
		
		String imageName = imageDAO.insertImageFile(imageVO);
		
		return imageName;
	}
}

@Repository("imageDAO")
public class ImageDAOImpl implements ImageDAO {
	
	@Autowired
	private SqlSession sqlSession;

	public String insertImageFile(ImageVO imageVO) throws DataAccessException {
		sqlSession.insert("mapper.image.insertImage",imageVO);
		
		String imageName = imageVO.getImage_file_name();
		return imageName;
	}
}


@Component("imageVO")
public class ImageVO {
	private String image_id;
	private String image_match_id;
	private String image_category;
	private String image_file_name;
	private Date image_cre_date;
	private byte[] image_file;
    
    // getter & setter
}


