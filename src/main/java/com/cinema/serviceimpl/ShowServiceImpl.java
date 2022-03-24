package com.cinema.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.dao.ShowsRepository;
import com.cinema.entity.Shows;
import com.cinema.exception.ShowException;
import com.cinema.service.ShowService;
@Service
public class ShowServiceImpl implements ShowService {
@Autowired
ShowsRepository showsrepositary;
	@Override
	public Shows addShow(Shows show) {
	
		return showsrepositary.save(show);
	}
	@Override
	public Shows getShowId(Integer showId) {
		return showsrepositary.findById(showId).orElseThrow(ShowException::new);
		}
	@Override
	public List<Shows> getAllShows() {
	    List<Shows> shows=(List<Shows>) showsrepositary.findAll();
		return shows;
	}

}
