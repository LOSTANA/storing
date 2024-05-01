package useful.ch03;

public class NickName {

	private String nick;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) throws NickNameException {
		if(nick == null) {
			throw new NickNameException("닉네임이 공란이 될 수 없습니다");
		}
		
		if(nick.length()>6) {
			throw new NickNameException("닉네임의 최대글자는 6글자 입니다");
		}
		if(nick.matches("[0-9a-zA-Z]+")) {
			throw new NickNameException("닉네임은 한글만 설정이 가능합니다");
		}
		
		this.nick = nick;
		
	}
}
