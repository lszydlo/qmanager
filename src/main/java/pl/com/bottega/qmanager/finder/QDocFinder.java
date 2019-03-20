package pl.com.bottega.qmanager.finder;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class QDocFinder {

	private final QDocDao dao;

	public List<QDocReadModel> find(String criteria) {
		return dao.findAll();
	}

}
