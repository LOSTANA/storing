package basic.exercise.interfaces;

public interface IUserinfoDao {
	
	// C R U D
	//public abstract 생략 가능
	// TODO - 매개변수 수정 예정
	
	public abstract void insertUserInfo(UserInfo info);
	public abstract void updateUserInfo(UserInfo info);
	public abstract void deleteUserInfo(int id);
	public abstract void selectUserInfo();
	
	}
