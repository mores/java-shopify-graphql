package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.FileCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FileCreateGraphQLQuery extends GraphQLQuery {
  public FileCreateGraphQLQuery(List<FileCreateInput> files, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (files != null || fieldsSet.contains("files")) {
        getInput().put("files", files);
    }
  }

  public FileCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fileCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<FileCreateInput> files;

    private String queryName;

    public FileCreateGraphQLQuery build() {
      return new FileCreateGraphQLQuery(files, queryName, fieldsSet);
               
    }

    
    public Builder files(List<FileCreateInput> files) {
      this.files = files;
      this.fieldsSet.add("files");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
