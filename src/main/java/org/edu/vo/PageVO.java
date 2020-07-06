package org.edu.vo;

public class PageVO {
	private int startBno;
	private int perPageNum;//null값 int는 불가능 Integer는 가능
	private Integer page;//jsp단에서 null값이 올 떄 에러가 발생하지 않도록 Integer사용 
	private int totalCount;
	private int endPage;
	private int startPage;
	private boolean prev;
	private boolean next;
	
	private void calcPage() {
		//page변수는 현재 jsp에서 클릭한 페이지번호
		int tempEnd = (int)(Math.ceil(page/10.0)*10);//
		//ceil함수는 천장 함수로 1.1 = 2, 2.1 = 3으로 출력됨
		//반대되는 바닥함수로 floor(), 반올림함수로 round()가 있다.
		//jsp에서 클릭한 페이지번호를기준으로 끝 페이지를 계산한다.
		this.startPage = tempEnd - 9;
		//시작 페이지 계산 클릭한 page번호 10일때 까지 시작페이지는 1
		if(tempEnd * 10 >this.totalCount) {
			//클릭한 page번호로 계산된 게시물 수가 실제게시물 개수(totalCount) 보다 클때
			this.endPage = (int)Math.ceil(this.totalCount/10.0);
		} else {
			//클릭한 page번호로 계산된 게시물 수가 실제게시물 개수(totalCount) 보다 작을 때
			this.endPage = tempEnd;
		}
		this.prev = this.startPage != 1;//시작페이지가 1보다 크면 무조건 이전페이지가 있다. 
		this.next = this.endPage * 10 < this.totalCount;
		//클릭한 page번호로 계산된 게시물 수가 실제 게시물 수 보다 작다면 다음페이지가 있음. true
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcPage();//totalCount 전체게시물개수가 있어야만 페이지계산을 할 수 있기 때문에
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public int getStartBno() {
		//DB쿼리에서 사용... 시작데이터번호 = (jsp에서 클릭한 페이지번호-1)*페이지당 보여지는 개수
		startBno = (this.page - 1) * perPageNum;
		return startBno;
	}
	public void setStartBno(int startBno) {
		this.startBno = startBno;
	}
	public int getPerPageNum() {
		return perPageNum;
	}
	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}
}
