package com.quipa.dao.profile;

import java.util.List;

import com.quipa.common.dao.Dao;
import com.quipa.model.profile.Request;

public interface RequestDao extends Dao {
	public Request save(Request request);

	public List<Request> listAll(Long profileId);

	public Request getById(Long requestId);

	public boolean remove(Request request);
}
