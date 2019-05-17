package top.harryper.dto;

public class AntiChickenSoupDto {

	private Integer ascId;
	private String ascContent;
	private Integer ascLike;
	private Integer ascDislike;
	public Integer getAscId() {
		return ascId;
	}
	public void setAscId(Integer ascId) {
		this.ascId = ascId;
	}
	public String getAscContent() {
		return ascContent;
	}
	public void setAscContent(String ascContent) {
		this.ascContent = ascContent;
	}
	public Integer getAscLike() {
		return ascLike;
	}
	public void setAscLike(Integer ascLike) {
		this.ascLike = ascLike;
	}
	public Integer getAscDislike() {
		return ascDislike;
	}
	public void setAscDislike(Integer ascDislike) {
		this.ascDislike = ascDislike;
	}
	@Override
	public String toString() {
		return "AntiChickenSoupDto [ascId=" + ascId + ", ascContent=" + ascContent + ", ascLike=" + ascLike
				+ ", ascDislike=" + ascDislike + "]";
	}
}
