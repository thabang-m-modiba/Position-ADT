/**
 * @author Thabang Mamoloko
 */

/**
 * 
 */
public class Task {
	private int taskID;
	private String taskName;
	private int priotity;
	private String status;
	/**
	 * @param taskID
	 * @param taskName
	 * @param priotity
	 * @param status
	 */
	public Task(int taskID, String taskName, int priotity, String status) {
		this.taskID = taskID;
		this.taskName = taskName;
		this.priotity = priotity;
		this.status = status;
	}
	/**
	 * @return the taskID
	 */
	public int getTaskID() {
		return taskID;
	}
	/**
	 * @param taskID the taskID to set
	 */
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}
	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}
	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	/**
	 * @return the priotity
	 */
	public int getPriotity() {
		return priotity;
	}
	/**
	 * @param priotity the priotity to set
	 */
	public void setPriotity(int priotity) {
		this.priotity = priotity;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Task [taskID=" + taskID + ", taskName=" + taskName + ", priotity=" + priotity + ", status=" + status
				+ "]";
	}
	
}
