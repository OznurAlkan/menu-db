package ie.com.chatbot.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import ie.com.chatbot.key.RatingKey;

@Entity
@Table(name = "rating")
public class Rating {
	@EmbeddedId
	private RatingKey key;

	private double rating;

	public RatingKey getKey() {
		return key;
	}

	public void setKey(RatingKey key) {
		this.key = key;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}
