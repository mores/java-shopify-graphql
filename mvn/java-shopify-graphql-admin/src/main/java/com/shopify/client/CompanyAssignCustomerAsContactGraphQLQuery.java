package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CompanyAssignCustomerAsContactGraphQLQuery extends GraphQLQuery {
  public CompanyAssignCustomerAsContactGraphQLQuery(String companyId, String customerId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyId != null || fieldsSet.contains("companyId")) {
        getInput().put("companyId", companyId);
    }if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }
  }

  public CompanyAssignCustomerAsContactGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyAssignCustomerAsContact";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyId;

    private String customerId;

    private String queryName;

    public CompanyAssignCustomerAsContactGraphQLQuery build() {
      return new CompanyAssignCustomerAsContactGraphQLQuery(companyId, customerId, queryName, fieldsSet);
               
    }

    
    public Builder companyId(String companyId) {
      this.companyId = companyId;
      this.fieldsSet.add("companyId");
      return this;
    }

    
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
