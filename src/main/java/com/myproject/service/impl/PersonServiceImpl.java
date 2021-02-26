package com.myproject.service.impl;

import com.myproject.vo.PersonVo;

public class PersonServiceImpl {

	
	public PersonVO findById(Integer id) throws Exception {

		Person person = persondao.getById(id);
		// 灏嶇敤鎴朵俊鎭�茶妤嫏铏曠悊銆�
		// ......

		//杩斿洖PersonVo銆�
		PersonVo personVo = new PersonVo();
		personV.id = person.id;
		
		return personVO;
		
	}
	
	
	
	public void updateItems(PersonVo personVo) throws Exception{
		//娣诲姞妤嫏鏍￠锛岄�氬父鍠簊ervice鎺ュ彛灏嶉棞閸靛弮鏁搁�茶鏍￠銆�
		// 渚嬪锛屾鏌d鏄惁鐖插悏銆傚嵆鏁告摎搴湁鍐囧憿姊濇暩鎿氥��
		// 妾㈡煡鐢ㄦ埗鍚嶃��
	}
	
	
	
	
}