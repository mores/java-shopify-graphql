package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.BalanceTransactionSortKeys;
import com.shopify.admin.types.PayoutSortKeys;
import com.shopify.admin.types.ShopifyPaymentsPayoutTransactionType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class ShopifyPaymentsAccountProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsAccountProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsAccount"));
  }

  public ShopifyPaymentsAccountProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> balance() {
     MoneyV2Projection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balance", projection);
     return projection;
  }

  public ShopifyPaymentsBalanceTransactionConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> balanceTransactions(
      ) {
     ShopifyPaymentsBalanceTransactionConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBalanceTransactionConnectionProjection<>(this, getRoot());
     getFields().put("balanceTransactions", projection);
     return projection;
  }

  public ShopifyPaymentsBalanceTransactionConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> balanceTransactions(
      Boolean hideTransfers, Integer first, String after, Integer last, String before,
      Boolean reverse, BalanceTransactionSortKeys sortKey, String query, String savedSearchId) {
    ShopifyPaymentsBalanceTransactionConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBalanceTransactionConnectionProjection<>(this, getRoot());    
    getFields().put("balanceTransactions", projection);
    getInputArguments().computeIfAbsent("balanceTransactions", k -> new ArrayList<>());                      
    InputArgument hideTransfersArg = new InputArgument("hideTransfers", hideTransfers, false, null);
    getInputArguments().get("balanceTransactions").add(hideTransfersArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("balanceTransactions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("balanceTransactions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("balanceTransactions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("balanceTransactions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("balanceTransactions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("balanceTransactions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("balanceTransactions").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId, false, null);
    getInputArguments().get("balanceTransactions").add(savedSearchIdArg);
    return projection;
  }

  public ShopifyPaymentsBalanceTransactionConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> balanceTransactionsWithVariableReferences(
      String hideTransfersReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference, String savedSearchIdReference) {
    ShopifyPaymentsBalanceTransactionConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBalanceTransactionConnectionProjection<>(this, getRoot());    
    getFields().put("balanceTransactions", projection);
    getInputArguments().computeIfAbsent("balanceTransactions", k -> new ArrayList<>());              
    InputArgument hideTransfersArg = new InputArgument("hideTransfers", hideTransfersReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("balanceTransactions").add(hideTransfersArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("balanceTransactions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("balanceTransactions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("balanceTransactions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("balanceTransactions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("balanceTransactions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("BalanceTransactionSortKeys"));
    getInputArguments().get("balanceTransactions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("balanceTransactions").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("balanceTransactions").add(savedSearchIdArg);
    return projection;
  }

  public ShopifyPaymentsBankAccountConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> bankAccounts(
      ) {
     ShopifyPaymentsBankAccountConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBankAccountConnectionProjection<>(this, getRoot());
     getFields().put("bankAccounts", projection);
     return projection;
  }

  public ShopifyPaymentsBankAccountConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> bankAccounts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ShopifyPaymentsBankAccountConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBankAccountConnectionProjection<>(this, getRoot());    
    getFields().put("bankAccounts", projection);
    getInputArguments().computeIfAbsent("bankAccounts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("bankAccounts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("bankAccounts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("bankAccounts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("bankAccounts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("bankAccounts").add(reverseArg);
    return projection;
  }

  public ShopifyPaymentsBankAccountConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> bankAccountsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ShopifyPaymentsBankAccountConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBankAccountConnectionProjection<>(this, getRoot());    
    getFields().put("bankAccounts", projection);
    getInputArguments().computeIfAbsent("bankAccounts", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("bankAccounts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("bankAccounts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("bankAccounts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("bankAccounts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("bankAccounts").add(reverseArg);
    return projection;
  }

  public ShopifyPaymentsChargeStatementDescriptorProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> chargeStatementDescriptors(
      ) {
     ShopifyPaymentsChargeStatementDescriptorProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsChargeStatementDescriptorProjection<>(this, getRoot());
     getFields().put("chargeStatementDescriptors", projection);
     return projection;
  }

  public CurrencyCodeProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> defaultCurrency(
      ) {
     CurrencyCodeProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("defaultCurrency", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> disputes(
      ) {
     ShopifyPaymentsDisputeConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeConnectionProjection<>(this, getRoot());
     getFields().put("disputes", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> disputes(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    ShopifyPaymentsDisputeConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeConnectionProjection<>(this, getRoot());    
    getFields().put("disputes", projection);
    getInputArguments().computeIfAbsent("disputes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("disputes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("disputes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("disputes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("disputes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("disputes").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("disputes").add(queryArg);
    return projection;
  }

  public ShopifyPaymentsDisputeConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> disputesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String queryReference) {
    ShopifyPaymentsDisputeConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeConnectionProjection<>(this, getRoot());    
    getFields().put("disputes", projection);
    getInputArguments().computeIfAbsent("disputes", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("disputes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("disputes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("disputes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("disputes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("disputes").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("disputes").add(queryArg);
    return projection;
  }

  public ShopifyPaymentsPayoutScheduleProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> payoutSchedule(
      ) {
     ShopifyPaymentsPayoutScheduleProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutScheduleProjection<>(this, getRoot());
     getFields().put("payoutSchedule", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> payouts(
      ) {
     ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutConnectionProjection<>(this, getRoot());
     getFields().put("payouts", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> payouts(
      ShopifyPaymentsPayoutTransactionType transactionType, Integer first, String after,
      Integer last, String before, Boolean reverse, PayoutSortKeys sortKey, String query,
      String savedSearchId) {
    ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutConnectionProjection<>(this, getRoot());    
    getFields().put("payouts", projection);
    getInputArguments().computeIfAbsent("payouts", k -> new ArrayList<>());                      
    InputArgument transactionTypeArg = new InputArgument("transactionType", transactionType, false, null);
    getInputArguments().get("payouts").add(transactionTypeArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("payouts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("payouts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("payouts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("payouts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("payouts").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("payouts").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("payouts").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId, false, null);
    getInputArguments().get("payouts").add(savedSearchIdArg);
    return projection;
  }

  public ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> payoutsWithVariableReferences(
      String transactionTypeReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference, String savedSearchIdReference) {
    ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsAccountProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutConnectionProjection<>(this, getRoot());    
    getFields().put("payouts", projection);
    getInputArguments().computeIfAbsent("payouts", k -> new ArrayList<>());              
    InputArgument transactionTypeArg = new InputArgument("transactionType", transactionTypeReference, true, new graphql.language.TypeName("ShopifyPaymentsPayoutTransactionType"));
    getInputArguments().get("payouts").add(transactionTypeArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("payouts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("payouts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("payouts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("payouts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("payouts").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("PayoutSortKeys"));
    getInputArguments().get("payouts").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("payouts").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("payouts").add(savedSearchIdArg);
    return projection;
  }

  public ShopifyPaymentsAccountProjection<PARENT, ROOT> accountOpenerName() {
    getFields().put("accountOpenerName", null);
    return this;
  }

  public ShopifyPaymentsAccountProjection<PARENT, ROOT> activated() {
    getFields().put("activated", null);
    return this;
  }

  public ShopifyPaymentsAccountProjection<PARENT, ROOT> chargeStatementDescriptor() {
    getFields().put("chargeStatementDescriptor", null);
    return this;
  }

  public ShopifyPaymentsAccountProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public ShopifyPaymentsAccountProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsAccountProjection<PARENT, ROOT> onboardable() {
    getFields().put("onboardable", null);
    return this;
  }

  public ShopifyPaymentsAccountProjection<PARENT, ROOT> payoutStatementDescriptor() {
    getFields().put("payoutStatementDescriptor", null);
    return this;
  }
}
