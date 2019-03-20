package pl.com.bottega.qmanager.preparation.domain;

import pl.com.bottega.qmanager.DomainEvent;

import java.util.List;

public interface EventStore {
	void append(List<DomainEvent> events);
}
