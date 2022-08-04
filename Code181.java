if( dataSize > 0) {
			orgData.put("root", new ArrayList<HashMap<String, Object>>());
			parentNode = orgData;			
			
			int level = 1;
			int key = 0;
			String sKey = "";
			
			for(int i  = 0 ; i < dataSize ; i++) {
				item = list.get(i);
				
				// 1레벨 (최상위 레벨의 경우)
				if((int)item.get("GROUP_LEVEL") == 1) {
					targetNode = (List<Map<String, Object>>) parentNode.get("root");
					sKey = Integer.toString(key);

				}
				// 1레벨 이상일 경우
				else {
					// 현재 노드의 레벨이, 이전 노드의 레벨과 다를경우(다음 레벨로 넘어갈때)
					if ((int)item.get("GROUP_LEVEL") != level) {
						parentNode = tmpNodes; // 쌓아둔 임시 노드들을 부모 노드에 대입
						tmpNodes = new HashMap<String, Object>(); // 임시 노드 객체 초기화
					}
					Map<String, Object> tmpNode = (Map<String, Object>) parentNode.get(item.get("P_GROUP_CODE")); //부모 노드의 GROUP_CODE와 현재 노드의 P_GROUP_CODE가 같은 객체를 찾는다.
					// 부모 노드에 현재 노드가 들어갈 수 있는 "children" 객체가 없을경우 생성한다.
					if(tmpNode.get("children") == null) {
						key = 0;
						tmpNode.put("children", new ArrayList<HashMap<String, Object>>());
					}
					targetNode = (List<Map<String, Object>>) tmpNode.get("children");
					sKey = (String)tmpNode.get("key") + "_" + Integer.toString(key);
				}

				// 새로운 노드를 생성하여 부모 노드에 입력한다.
				Map<String, Object> node = new HashMap<String, Object>();
				Map<String, Object> subNode = new HashMap<String, Object>();				
				subNode.put("label", item.get("GROUP_NAME"));
				subNode.put("value", item.get("GROUP_CODE"));
				node.put("data", subNode);
				node.put("key", sKey);
				targetNode.add(node); // 참조하고있는 부모 노드에 현재 노드를 대입한다.
				tmpNodes.put((String)item.get("GROUP_CODE"), node); // 추후 부모 노드 참고를 위한 임시 노드 리스트에 같은 객체주소를 할당한다.
				level = (int)item.get("GROUP_LEVEL");
				key++;
			}
						
		}
