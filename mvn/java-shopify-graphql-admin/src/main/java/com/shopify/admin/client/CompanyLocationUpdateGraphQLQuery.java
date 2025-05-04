package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CompanyLocationUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a company location.
 */
public class CompanyLocationUpdateGraphQLQuery extends GraphQLQuery {
  public CompanyLocationUpdateGraphQLQuery(String companyLocationId,
      CompanyLocationUpdateInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CompanyLocationUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyLocationId;

    private CompanyLocationUpdateInput input;

    private String queryName;

    public CompanyLocationUpdateGraphQLQuery build() {
      return new CompanyLocationUpdateGraphQLQuery(companyLocationId, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the company location to update.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The input fields to update in the company location.
     */
    public Builder input(CompanyLocationUpdateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
