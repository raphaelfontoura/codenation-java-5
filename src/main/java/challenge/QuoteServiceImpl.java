package challenge;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;

	@Override
	public Quote getQuote() {
		List<Quote> quotes = repository.findAll();
		Collections.shuffle(quotes);
		return quotes.stream().findFirst().get();
	}

	@Override
	public Quote getQuoteByActor(String actor) {
		List<Quote> quotes = repository.findByActor(actor);
		Collections.shuffle(quotes);
		return quotes.stream().findFirst().get();
	}

}
