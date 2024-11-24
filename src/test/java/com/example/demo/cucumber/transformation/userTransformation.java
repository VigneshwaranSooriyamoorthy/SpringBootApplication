package com.example.demo.cucumber.transformation;

import com.example.demo.cucumber.DataType.User;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;

import java.util.List;

public class userTransformation {

    @DataTableType
    public List<User> toUsers(DataTable dataTable) {
        return dataTable.entries()
                .stream()
                .map(row -> User.builder()
                        .firstName(row.get("FirstName"))
                        .lastName(row.get("LastName"))
                        .email(row.get("Email"))
                        .address(row.getOrDefault("Address", "Somewhere"))
                        .build())
                .toList();
    }
}
