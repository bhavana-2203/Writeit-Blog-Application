package com.writeit.entities;

import java.util.Date;
import java.util.List;

import com.writeit.constants.GlobalConstants;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String title;
	@Lob
	private String content;
	private String image=GlobalConstants.DEFAULT_POST_IMAGE_NAME;
	private Date date;
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[] imageData;
	
	@ManyToOne
	@JoinColumn(name = "cid")
	private Category category;
	@ManyToOne
	@JoinColumn(name = "uid")
	private User user;
	
	@OneToMany(mappedBy ="post",cascade = CascadeType.ALL)
	private List<Comment> comments;

    public void setDate(Date date) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setCategory(Category foundcategory) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setImageData(byte[] imageData) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setUser(User founduser) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setImage(String POST_IMAGE_UPLOADED) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object getTitle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getContent() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setContent(String content) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setTitle(Object title2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTitle'");
    }
}