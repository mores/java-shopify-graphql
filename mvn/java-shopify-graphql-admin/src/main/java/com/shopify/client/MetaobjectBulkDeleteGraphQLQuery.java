package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MetaobjectBulkDeleteWhereCondition;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class MetaobjectBulkDeleteGraphQLQuery extends GraphQLQuery {
  public MetaobjectBulkDeleteGraphQLQuery(MetaobjectBulkDeleteWhereCondition where,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (where != null || fieldsSet.contains("where")) {
        getInput().put("where", where);
    }
  }

  public MetaobjectBulkDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metaobjectBulkDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MetaobjectBulkDeleteWhereCondition where;

    private String queryName;

    public MetaobjectBulkDeleteGraphQLQuery build() {
      return new MetaobjectBulkDeleteGraphQLQuery(where, queryName, fieldsSet);
               
    }

    
    public Builder where(MetaobjectBulkDeleteWhereCondition where) {
      this.where = where;
      this.fieldsSet.add("where");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
