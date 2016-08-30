package com.anhry.app.ansafety.manage.infos.bean;

/**
 * 系统常量
 * @author Haitao Song
 *
 */
public class InfosConstants {
	/*********************************************************************数据字典**********************************************************/
	 
	public static final String USER_TYPE_SPONSOR = "1";  //资助人
	public static final String USER_TYPE_SITE_CHIEF = "2";  //站点负责人
	public static final String USER_TYPE_GUARDIAN = "3";  //监护人
	public static final String USER_TYPE_STUDENT = "4";  //学生
	
	public static final String ROLE_CODE_SPONSOR = "sponsor";  //资助人
	public static final String ROLE_CODE_SITE_CHIEF = "site_chief";  //站点负责人
	public static final String ROLE_CODE_GUARDIAN = "guardian";  //监护人
	public static final String ROLE_CODE_STUDENT = "student";  //学生
	
	public static final String GUARDIAN_IS_CHIEF = "1";  //是站点负责人
	
	
	public static final String fund_status_true = "0";	//是待资助学生
	public static final String fund_status_false = "1";	//是已资助学生
	
	
	public static final String STUDENT_HEAD_PICTURE = "0"; 		//学生头像图片
	public static final String STUDENT_FAMILY_PICTURE = "1"; 	//学生家庭图片
	
	
	public static final String PAY_TYPE_WECHAT = "0";  			//微信
	public static final String PAY_TYPE_BANK_CARD = "1";  		//银行卡
	public static final String PAY_TYPE_ALIPAY = "2";  			//支付宝
	public static final String PAY_TYPE_OFFLINE = "3";  		//线下
	
	public static final String FUND_TYPE_FIRST = "0";  			//首笔资助
	public static final String FUND_TYPE_OTHER = "1";  			//追加资助
	
	public static final String FUNDED_TYPE_CURRENT = "0";  		//当前资助
	public static final String FUNDED_TYPE_LAST = "1";  		//往年资助
	
	public static final String EXAMINATION_STATUS_FALSE = "0";  	//审批未通过
	public static final String EXAMINATION_STATUS_TRUE = "1";  		//审批通过
	
	public static final String CONFIRM_STATUS_FALSE = "0";  	//资助信息未审批
	public static final String CONFIRM_STATUS_TRUE = "1";  		//资助信息已审批
	
	public static final String IS_CHIEF_FALSE = "0";  		//是站点负责人
	public static final String IS_CHIEF_TRUE = "1";  		//不是站点负责人
	
	
}
