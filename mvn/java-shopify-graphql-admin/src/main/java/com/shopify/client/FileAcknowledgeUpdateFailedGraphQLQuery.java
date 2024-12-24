package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FileAcknowledgeUpdateFailedGraphQLQuery extends GraphQLQuery {
  public FileAcknowledgeUpdateFailedGraphQLQuery(List<String> fileIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fileIds != null || fieldsSet.contains("fileIds")) {
        getInput().put("fileIds", fileIds);
    }
  }

  public FileAcknowledgeUpdateFailedGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fileAcknowledgeUpdateFailed";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> fileIds;

    private String queryName;

    public FileAcknowledgeUpdateFailedGraphQLQuery build() {
      return new FileAcknowledgeUpdateFailedGraphQLQuery(fileIds, queryName, fieldsSet);
               
    }

    
    public Builder fileIds(List<String> fileIds) {
      this.fileIds = fileIds;
      this.fieldsSet.add("fileIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
