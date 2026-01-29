package exam;

import dao.MemberDao;
import dto.Member;

/**
 * update()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class UpdateMain {
	public static void main(String[] args) {

		MemberDao dao = new MemberDao();
		Member member = dao.load(2);

		member.getId();
		member.getName();
		member.getAge();
		member.getDepartmentId();

		member.setAge(100);

		dao.update(member);

		System.out.println("update終了");
	}
}
