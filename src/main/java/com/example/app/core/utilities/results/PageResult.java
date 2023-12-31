package com.example.app.core.utilities.results;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PageResult <T>{
	int pageNo;
	int pageSize;
	int totalPages;
	List<T> rows;
}
