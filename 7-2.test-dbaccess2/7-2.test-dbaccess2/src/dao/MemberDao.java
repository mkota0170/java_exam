package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DBManager;
import dto.Member;

/**
 * membersテーブルを操作するDao.
 * 
 * @author igamasayuki
 *
 */
public class MemberDao {
	private static final String TABLE_NAME = "test_members";

	/**
	 * 全件検索を行います.
	 * 
	 * @return メンバー情報の全件
	 */
	public List<Member> findAll() {
		Connection con = DBManager.createConnection();
		String sql = "SELECT id, name, age, dep_id FROM " + TABLE_NAME + " ORDER BY age DESC";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに全件検索処理を書く
			ResultSet rs = pstmt.executeQuery();
			List<Member> list = new ArrayList<>();

			while (rs.next()) {
				Member member = new Member();
				member.setId(rs.getInt("id"));
				member.setName(rs.getString("name"));
				member.setAge(rs.getInt("age"));
				member.setDepartmentId(rs.getInt("dep_id"));
				list.add(member);

			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("全件検索処理に失敗しました", e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	public Member load(int id) {
		Connection con = DBManager.createConnection();
		String sql = "SELECT id, name, age, dep_id FROM " + TABLE_NAME + " WHERE id = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに主キー検索処理を書く
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				Member member = new Member();
				member.setId(rs.getInt("id"));
				member.setName(rs.getString("name"));
				member.setAge(rs.getInt("age"));
				member.setDepartmentId(rs.getInt("dep_id"));
				return member;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("主キー検索処理に失敗しました", e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	/**
	 * メンバー情報を登録します.
	 * 
	 * @param member メンバー情報
	 */
	public void insert(Member member) {
		Connection con = DBManager.createConnection();
		String sql = "INSERT INTO " + TABLE_NAME + " (name, age, dep_id)" + "VALUES(?,?,?);";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに挿入処理を書く
			pstmt.setString(1, member.getName());
			pstmt.setInt(2, member.getAge());
			pstmt.setInt(3, member.getDepartmentId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました", e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	public void update(Member member) {
		Connection con = DBManager.createConnection();
		String sql = "UPDATE " + TABLE_NAME + " SET id = ?, name = ?, age = ?, dep_id = ? WHERE id = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに挿入処理を書く
			pstmt.setInt(1, member.getId());
			pstmt.setString(2, member.getName());
			pstmt.setInt(3, member.getAge());
			pstmt.setInt(4, member.getDepartmentId());
			pstmt.setInt(5, member.getId());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("更新処理に失敗しました", e);
		} finally {
			DBManager.closeConnection(con);
		}
	}
}
