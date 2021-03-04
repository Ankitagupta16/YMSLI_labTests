package com.traineeapp.service;

import java.util.List;


import com.traineeapp.trainee.Trainee;
import com.traineeapp.trainee.TraineeDao;
import com.traineeapp.trainee.TraineeDaoImpl;

public class TraineeServiceImpl implements TraineeService{
	private TraineeDao traineeDao;
	
	
	public TraineeServiceImpl() {
		this.traineeDao=new TraineeDaoImpl();
	}

	@Override
	public List<Trainee> allTrainees() {
		
		return traineeDao.allTrainees();
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		return traineeDao.addTrainee(trainee);
	}

	@Override
	public Trainee getTraineeById(int id) {
		return traineeDao.getTraineeById(id);
	}

}
