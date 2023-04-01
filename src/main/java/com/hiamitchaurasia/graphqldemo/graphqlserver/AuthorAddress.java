package com.hiamitchaurasia.graphqldemo.graphqlserver;

import java.util.Arrays;
import java.util.List;

public record AuthorAddress (String id, String addressLine1, String addressLine2,
                             String state, String city, String country, String zipCode) {

    private static List<com.hiamitchaurasia.graphqldemo.graphqlserver.AuthorAddress> authorAddresses = Arrays.asList(
            new com.hiamitchaurasia.graphqldemo.graphqlserver.AuthorAddress("author-add-1", "Line11", "Line12","State1","City1","Country1","ZipCode1"),
            new com.hiamitchaurasia.graphqldemo.graphqlserver.AuthorAddress("author-add-2", "Line21", "Line22","State2","City2","Country2","ZipCode2"),
            new com.hiamitchaurasia.graphqldemo.graphqlserver.AuthorAddress("author-add-3", "Line31", "Line32","State3","City3","Country3","ZipCode3")
    );

    public static com.hiamitchaurasia.graphqldemo.graphqlserver.AuthorAddress getById(String id) {
        return authorAddresses.stream()
                .filter(address -> address.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}
