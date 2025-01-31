package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MetafieldDefinitionConstraintStatus;
import com.shopify.types.MetafieldDefinitionConstraintSubtypeIdentifier;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class StandardMetafieldDefinitionTemplatesGraphQLQuery extends GraphQLQuery {
  public StandardMetafieldDefinitionTemplatesGraphQLQuery(
      MetafieldDefinitionConstraintSubtypeIdentifier constraintSubtype,
      MetafieldDefinitionConstraintStatus constraintStatus, Boolean excludeActivated, Integer first,
      String after, Integer last, String before, Boolean reverse, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (constraintSubtype != null || fieldsSet.contains("constraintSubtype")) {
        getInput().put("constraintSubtype", constraintSubtype);
    }if (constraintStatus != null || fieldsSet.contains("constraintStatus")) {
        getInput().put("constraintStatus", constraintStatus);
    }if (excludeActivated != null || fieldsSet.contains("excludeActivated")) {
        getInput().put("excludeActivated", excludeActivated);
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

  public StandardMetafieldDefinitionTemplatesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "standardMetafieldDefinitionTemplates";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MetafieldDefinitionConstraintSubtypeIdentifier constraintSubtype;

    private MetafieldDefinitionConstraintStatus constraintStatus;

    private Boolean excludeActivated;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private String queryName;

    public StandardMetafieldDefinitionTemplatesGraphQLQuery build() {
      return new StandardMetafieldDefinitionTemplatesGraphQLQuery(constraintSubtype, constraintStatus, excludeActivated, first, after, last, before, reverse, queryName, fieldsSet);
               
    }

    
    public Builder constraintSubtype(
        MetafieldDefinitionConstraintSubtypeIdentifier constraintSubtype) {
      this.constraintSubtype = constraintSubtype;
      this.fieldsSet.add("constraintSubtype");
      return this;
    }

    
    public Builder constraintStatus(MetafieldDefinitionConstraintStatus constraintStatus) {
      this.constraintStatus = constraintStatus;
      this.fieldsSet.add("constraintStatus");
      return this;
    }

    
    public Builder excludeActivated(Boolean excludeActivated) {
      this.excludeActivated = excludeActivated;
      this.fieldsSet.add("excludeActivated");
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
