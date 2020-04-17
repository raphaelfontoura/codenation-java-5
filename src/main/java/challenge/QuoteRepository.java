package challenge;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote, Integer> {

	public List<Quote> findByActor(String actor);
	
}
