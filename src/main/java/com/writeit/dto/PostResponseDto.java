package com.writeit.dto;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostResponseDto {
	private List<PostDto> posts;
	private Integer currentpage;
	private Integer totalpage;
	private long totalposts;
	private boolean islastpage;

    public void setPosts(List<PostDto> postsdtos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setIslastpage(boolean last) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setTotalpage(int totalPages) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setTotalposts(long totalElements) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setCurrentpage(int number) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}