package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CompanyAssignMainContactGraphQLQuery extends GraphQLQuery {
  public CompanyAssignMainContactGraphQLQuery(String companyId, String companyContactId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyId != null || fieldsSet.contains("companyId")) {
        getInput().put("companyId", companyId);
    }if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }
  }

  public CompanyAssignMainContactGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyAssignMainContact";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyId;

    private String companyContactId;

    private String queryName;

    public CompanyAssignMainContactGraphQLQuery build() {
      return new CompanyAssignMainContactGraphQLQuery(companyId, companyContactId, queryName, fieldsSet);
               
    }

    
    public Builder companyId(String companyId) {
      this.companyId = companyId;
      this.fieldsSet.add("companyId");
      return this;
    }

    
    public Builder companyContactId(String companyContactId) {
      this.companyContactId = companyContactId;
      this.fieldsSet.add("companyContactId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
