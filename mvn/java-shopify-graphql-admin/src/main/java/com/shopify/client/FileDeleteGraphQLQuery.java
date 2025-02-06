package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Deletes existing file assets that were uploaded to Shopify.
 */
public class FileDeleteGraphQLQuery extends GraphQLQuery {
  public FileDeleteGraphQLQuery(List<String> fileIds, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fileIds != null || fieldsSet.contains("fileIds")) {
        getInput().put("fileIds", fileIds);
    }
  }

  public FileDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fileDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> fileIds;

    private String queryName;

    public FileDeleteGraphQLQuery build() {
      return new FileDeleteGraphQLQuery(fileIds, queryName, fieldsSet);
               
    }

    /**
     * The IDs of the files to be deleted.
     */
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
