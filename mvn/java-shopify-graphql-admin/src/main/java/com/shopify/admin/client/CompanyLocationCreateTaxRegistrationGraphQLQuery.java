package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a tax registration for a company location.
 */
public class CompanyLocationCreateTaxRegistrationGraphQLQuery extends GraphQLQuery {
  public CompanyLocationCreateTaxRegistrationGraphQLQuery(String locationId, String taxId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }if (taxId != null || fieldsSet.contains("taxId")) {
        getInput().put("taxId", taxId);
    }
  }

  public CompanyLocationCreateTaxRegistrationGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationCreateTaxRegistration";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String locationId;

    private String taxId;

    private String queryName;

    public CompanyLocationCreateTaxRegistrationGraphQLQuery build() {
      return new CompanyLocationCreateTaxRegistrationGraphQLQuery(locationId, taxId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the company location that the tax registration gets assigned to.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    /**
     * The unique tax id for the tax registration.
     */
    public Builder taxId(String taxId) {
      this.taxId = taxId;
      this.fieldsSet.add("taxId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
