package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class PrivateMetafieldsGraphQLQuery extends GraphQLQuery {
  public PrivateMetafieldsGraphQLQuery(String namespace, String owner, Integer first, String after,
      Integer last, String before, Boolean reverse, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (namespace != null || fieldsSet.contains("namespace")) {
        getInput().put("namespace", namespace);
    }if (owner != null || fieldsSet.contains("owner")) {
        getInput().put("owner", owner);
    }if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }
  }

  public PrivateMetafieldsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "privateMetafields";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String namespace;

    private String owner;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private String queryName;

    public PrivateMetafieldsGraphQLQuery build() {
      return new PrivateMetafieldsGraphQLQuery(namespace, owner, first, after, last, before, reverse, queryName, fieldsSet);
               
    }

    
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      this.fieldsSet.add("namespace");
      return this;
    }

    
    public Builder owner(String owner) {
      this.owner = owner;
      this.fieldsSet.add("owner");
      return this;
    }

    
    public Builder first(Integer first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    
    public Builder after(String after) {
      this.after = after;
      this.fieldsSet.add("after");
      return this;
    }

    
    public Builder last(Integer last) {
      this.last = last;
      this.fieldsSet.add("last");
      return this;
    }

    
    public Builder before(String before) {
      this.before = before;
      this.fieldsSet.add("before");
      return this;
    }

    
    public Builder reverse(Boolean reverse) {
      this.reverse = reverse;
      this.fieldsSet.add("reverse");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
