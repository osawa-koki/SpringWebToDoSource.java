package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TaskDao;
import com.example.demo.entity.Task;

@Service
public class TaskServiceImpl implements TaskService {

	private final TaskDao dao;

	public TaskServiceImpl(TaskDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Task> findAll() {

    return dao.findAll();
	}

	@Override
	public Optional<Task> getTask(int id) {

    try {
      return dao.findById(id);
    } catch (EmptyResultDataAccessException e) {
      throw new TaskNotFoundException("cannot find a task specified.");
    }

	}

	@Override
	public void insert(Task task) {
    dao.insert(task);
	}

	@Override
	public void update(Task task) {

		if (dao.update(task) == 0) {
      throw new TaskNotFoundException("cannot find a task to update.");
    }

	}

	@Override
	public void deleteById(int id) {

    if (dao.deleteById(id) == 0) {
      throw new TaskNotFoundException("cannot find a task to delete.");
    }

	}

	@Override
	public List<Task> findByType(int typeId) {
		//2-3 typeIdを引数に指定してdaoのfindByType実行し、結果をreturnする
		return null;
	}
}
