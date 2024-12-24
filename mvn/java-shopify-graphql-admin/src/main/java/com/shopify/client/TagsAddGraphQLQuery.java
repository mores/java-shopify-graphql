package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class TagsAddGraphQLQuery extends GraphQLQuery {
  public TagsAddGraphQLQuery(String id, List<String> tags, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (tags != null || fieldsSet.contains("tags")) {
        getInput().put("tags", tags);
    }
  }

  public TagsAddGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "tagsAdd";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<String> tags;

    private String queryName;

    public TagsAddGraphQLQuery build() {
      return new TagsAddGraphQLQuery(id, tags, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      this.fieldsSet.add("tags");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
