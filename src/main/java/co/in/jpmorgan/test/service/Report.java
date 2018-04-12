package co.in.jpmorgan.test.service;

import java.util.List;

import co.in.jpmorgan.test.entities.Item;

public interface Report {
	void generate(List<Item> units);
}
