package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.FileUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FileUpdateGraphQLQuery extends GraphQLQuery {
  public FileUpdateGraphQLQuery(List<FileUpdateInput> files, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (files != null || fieldsSet.contains("files")) {
        getInput().put("files", files);
    }
  }

  public FileUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fileUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<FileUpdateInput> files;

    private String queryName;

    public FileUpdateGraphQLQuery build() {
      return new FileUpdateGraphQLQuery(files, queryName, fieldsSet);
               
    }

    
    public Builder files(List<FileUpdateInput> files) {
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
