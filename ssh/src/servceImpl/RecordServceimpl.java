package servceImpl;

import java.util.List;

import dao.record;
import entity.Record;
import servce.RecordServce;

public class RecordServceimpl implements RecordServce {

	private record dao;

	@Override
	public List<Record> cha() {
		return dao.cha();
	}

}
