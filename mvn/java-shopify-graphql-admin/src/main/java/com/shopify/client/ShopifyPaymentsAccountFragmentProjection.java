package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.BalanceTransactionSortKeys;
import com.shopify.types.PayoutSortKeys;
import com.shopify.types.ShopifyPaymentsPayoutTransactionType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class ShopifyPaymentsAccountFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopifyPaymentsAccountFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsAccount"));
  }

  public ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> balance() {
     MoneyV2Projection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balance", projection);
     return projection;
  }

  public ShopifyPaymentsBalanceTransactionConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> balanceTransactions(
      ) {
     ShopifyPaymentsBalanceTransactionConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBalanceTransactionConnectionProjection<>(this, getRoot());
     getFields().put("balanceTransactions", projection);
     return projection;
  }

  public ShopifyPaymentsBalanceTransactionConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> balanceTransactions(
      Boolean hideTransfers, Integer first, String after, Integer last, String before,
      Boolean reverse, BalanceTransactionSortKeys sortKey, String query, String savedSearchId) {
    ShopifyPaymentsBalanceTransactionConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBalanceTransactionConnectionProjection<>(this, getRoot());    
    getFields().put("balanceTransactions", projection);
    getInputArguments().computeIfAbsent("balanceTransactions", k -> new ArrayList<>());                      
    InputArgument hideTransfersArg = new InputArgument("hideTransfers", hideTransfers);
    getInputArguments().get("balanceTransactions").add(hideTransfersArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("balanceTransactions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("balanceTransactions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("balanceTransactions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("balanceTransactions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("balanceTransactions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("balanceTransactions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("balanceTransactions").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("balanceTransactions").add(savedSearchIdArg);
    return projection;
  }

  public ShopifyPaymentsBankAccountConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> bankAccounts(
      ) {
     ShopifyPaymentsBankAccountConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBankAccountConnectionProjection<>(this, getRoot());
     getFields().put("bankAccounts", projection);
     return projection;
  }

  public ShopifyPaymentsBankAccountConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> bankAccounts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ShopifyPaymentsBankAccountConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBankAccountConnectionProjection<>(this, getRoot());    
    getFields().put("bankAccounts", projection);
    getInputArguments().computeIfAbsent("bankAccounts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("bankAccounts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("bankAccounts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("bankAccounts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("bankAccounts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("bankAccounts").add(reverseArg);
    return projection;
  }

  public ShopifyPaymentsChargeStatementDescriptorProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> chargeStatementDescriptors(
      ) {
     ShopifyPaymentsChargeStatementDescriptorProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsChargeStatementDescriptorProjection<>(this, getRoot());
     getFields().put("chargeStatementDescriptors", projection);
     return projection;
  }

  public CurrencyCodeProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> defaultCurrency(
      ) {
     CurrencyCodeProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("defaultCurrency", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> disputes(
      ) {
     ShopifyPaymentsDisputeConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeConnectionProjection<>(this, getRoot());
     getFields().put("disputes", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> disputes(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    ShopifyPaymentsDisputeConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeConnectionProjection<>(this, getRoot());    
    getFields().put("disputes", projection);
    getInputArguments().computeIfAbsent("disputes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("disputes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("disputes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("disputes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("disputes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("disputes").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("disputes").add(queryArg);
    return projection;
  }

  public ShopifyPaymentsPayoutScheduleProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> payoutSchedule(
      ) {
     ShopifyPaymentsPayoutScheduleProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutScheduleProjection<>(this, getRoot());
     getFields().put("payoutSchedule", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> payouts(
      ) {
     ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutConnectionProjection<>(this, getRoot());
     getFields().put("payouts", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> payouts(
      ShopifyPaymentsPayoutTransactionType transactionType, Integer first, String after,
      Integer last, String before, Boolean reverse, PayoutSortKeys sortKey, String query,
      String savedSearchId) {
    ShopifyPaymentsPayoutConnectionProjection<ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutConnectionProjection<>(this, getRoot());    
    getFields().put("payouts", projection);
    getInputArguments().computeIfAbsent("payouts", k -> new ArrayList<>());                      
    InputArgument transactionTypeArg = new InputArgument("transactionType", transactionType);
    getInputArguments().get("payouts").add(transactionTypeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("payouts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("payouts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("payouts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("payouts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("payouts").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("payouts").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("payouts").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("payouts").add(savedSearchIdArg);
    return projection;
  }

  public ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT> activated() {
    getFields().put("activated", null);
    return this;
  }

  public ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT> chargeStatementDescriptor() {
    getFields().put("chargeStatementDescriptor", null);
    return this;
  }

  public ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT> onboardable() {
    getFields().put("onboardable", null);
    return this;
  }

  public ShopifyPaymentsAccountFragmentProjection<PARENT, ROOT> payoutStatementDescriptor() {
    getFields().put("payoutStatementDescriptor", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopifyPaymentsAccount {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
