package com.julscode.inventorybackend.response;

import com.julscode.inventorybackend.model.Category;
import lombok.Data;

import java.util.List;

@Data
public class CategoryResponse {

    private List<Category> category;
}
