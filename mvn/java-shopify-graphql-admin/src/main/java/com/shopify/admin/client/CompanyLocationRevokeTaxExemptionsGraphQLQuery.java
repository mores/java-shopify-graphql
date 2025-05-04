package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.TaxExemption;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Revokes tax exemptions from the company location.
 */
public class CompanyLocationRevokeTaxExemptionsGraphQLQuery extends GraphQLQuery {
  public CompanyLocationRevokeTaxExemptionsGraphQLQuery(String companyLocationId,
      List<TaxExemption> taxExemptions, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (taxExemptions != null || fieldsSet.contains("taxExemptions")) {
        getInput().put("taxExemptions", taxExemptions);
    }
  }

  public CompanyLocationRevokeTaxExemptionsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationRevokeTaxExemptions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyLocationId;

    private List<TaxExemption> taxExemptions;

    private String queryName;

    public CompanyLocationRevokeTaxExemptionsGraphQLQuery build() {
      return new CompanyLocationRevokeTaxExemptionsGraphQLQuery(companyLocationId, taxExemptions, queryName, fieldsSet);
               
    }

    /**
     * The location from which the tax exemptions will be revoked.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The tax exemptions that are being revoked from the location.
     */
    public Builder taxExemptions(List<TaxExemption> taxExemptions) {
      this.taxExemptions = taxExemptions;
      this.fieldsSet.add("taxExemptions");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
