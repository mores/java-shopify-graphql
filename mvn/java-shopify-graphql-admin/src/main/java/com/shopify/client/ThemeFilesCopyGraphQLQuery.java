package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ThemeFilesCopyFileInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ThemeFilesCopyGraphQLQuery extends GraphQLQuery {
  public ThemeFilesCopyGraphQLQuery(String themeId, List<ThemeFilesCopyFileInput> files,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (themeId != null || fieldsSet.contains("themeId")) {
        getInput().put("themeId", themeId);
    }if (files != null || fieldsSet.contains("files")) {
        getInput().put("files", files);
    }
  }

  public ThemeFilesCopyGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "themeFilesCopy";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String themeId;

    private List<ThemeFilesCopyFileInput> files;

    private String queryName;

    public ThemeFilesCopyGraphQLQuery build() {
      return new ThemeFilesCopyGraphQLQuery(themeId, files, queryName, fieldsSet);
               
    }

    
    public Builder themeId(String themeId) {
      this.themeId = themeId;
      this.fieldsSet.add("themeId");
      return this;
    }

    
    public Builder files(List<ThemeFilesCopyFileInput> files) {
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
