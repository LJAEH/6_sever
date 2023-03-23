package edu.kh.community.member.model.vo;

public class Member {
	
	private int memberNo;
	private String memberEmail;
	private String memberPw;
	private String memberNick;
	private String memberTel;
	private String memberAddress;
	private String enrollDate;
	private String secessionFlag;
	
	public Member () {}

	public Member(int memberNo, String memberEmail, String memberPw, String memberNick, String memberTel,
			String memberAddress, String enrollDate, String secessionFlag) {
		super();
		this.memberNo = memberNo;
		this.memberEmail = memberEmail;
		this.memberPw = memberPw;
		this.memberNick = memberNick;
		this.memberTel = memberTel;
		this.memberAddress = memberAddress;
		this.enrollDate = enrollDate;
		this.secessionFlag = secessionFlag;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberNick() {
		return memberNick;
	}

	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}

	public String getMemberTel() {
		return memberTel;
	}

	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getSecessionFlag() {
		return secessionFlag;
	}

	public void setSecessionFlag(String secessionFlag) {
		this.secessionFlag = secessionFlag;
	}

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberEmail=" + memberEmail + ", memberPw=" + memberPw
				+ ", memberNick=" + memberNick + ", memberTel=" + memberTel + ", memberAddress=" + memberAddress
				+ ", enrollDate=" + enrollDate + ", secessionFlag=" + secessionFlag + "]";
	}
	
	
	
	
}
