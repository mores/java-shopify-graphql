package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The properties and status of a bulk discount redeem code creation operation.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountRedeemCodeBulkCreation implements com.shopify.admin.types.Node {
  /**
   * The result of each code creation operation associated with the bulk creation
   * operation including any errors that might have occurred during the operation.
   */
  private DiscountRedeemCodeBulkCreationCodeConnection codes;

  /**
   * The number of codes to create.
   */
  private int codesCount;

  /**
   * The date and time when the bulk creation was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The code discount associated with the created codes.
   */
  private DiscountCodeNode discountCode;

  /**
   * Whether the bulk creation is still queued (`false`) or has been run (`true`).
   */
  private boolean done;

  /**
   * The number of codes that weren't created successfully.
   */
  private int failedCount;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The number of codes created successfully.
   */
  private int importedCount;

  public DiscountRedeemCodeBulkCreation() {
  }

  /**
   * The result of each code creation operation associated with the bulk creation
   * operation including any errors that might have occurred during the operation.
   */
  public DiscountRedeemCodeBulkCreationCodeConnection getCodes() {
    return codes;
  }

  public void setCodes(DiscountRedeemCodeBulkCreationCodeConnection codes) {
    this.codes = codes;
  }

  /**
   * The number of codes to create.
   */
  public int getCodesCount() {
    return codesCount;
  }

  public void setCodesCount(int codesCount) {
    this.codesCount = codesCount;
  }

  /**
   * The date and time when the bulk creation was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The code discount associated with the created codes.
   */
  public DiscountCodeNode getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(DiscountCodeNode discountCode) {
    this.discountCode = discountCode;
  }

  /**
   * Whether the bulk creation is still queued (`false`) or has been run (`true`).
   */
  public boolean getDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  /**
   * The number of codes that weren't created successfully.
   */
  public int getFailedCount() {
    return failedCount;
  }

  public void setFailedCount(int failedCount) {
    this.failedCount = failedCount;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The number of codes created successfully.
   */
  public int getImportedCount() {
    return importedCount;
  }

  public void setImportedCount(int importedCount) {
    this.importedCount = importedCount;
  }

  @Override
  public String toString() {
    return "DiscountRedeemCodeBulkCreation{codes='" + codes + "', codesCount='" + codesCount + "', createdAt='" + createdAt + "', discountCode='" + discountCode + "', done='" + done + "', failedCount='" + failedCount + "', id='" + id + "', importedCount='" + importedCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountRedeemCodeBulkCreation that = (DiscountRedeemCodeBulkCreation) o;
    return Objects.equals(codes, that.codes) &&
        codesCount == that.codesCount &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(discountCode, that.discountCode) &&
        done == that.done &&
        failedCount == that.failedCount &&
        Objects.equals(id, that.id) &&
        importedCount == that.importedCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(codes, codesCount, createdAt, discountCode, done, failedCount, id, importedCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The result of each code creation operation associated with the bulk creation
     * operation including any errors that might have occurred during the operation.
     */
    private DiscountRedeemCodeBulkCreationCodeConnection codes;

    /**
     * The number of codes to create.
     */
    private int codesCount;

    /**
     * The date and time when the bulk creation was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The code discount associated with the created codes.
     */
    private DiscountCodeNode discountCode;

    /**
     * Whether the bulk creation is still queued (`false`) or has been run (`true`).
     */
    private boolean done;

    /**
     * The number of codes that weren't created successfully.
     */
    private int failedCount;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The number of codes created successfully.
     */
    private int importedCount;

    public DiscountRedeemCodeBulkCreation build() {
      DiscountRedeemCodeBulkCreation result = new DiscountRedeemCodeBulkCreation();
      result.codes = this.codes;
      result.codesCount = this.codesCount;
      result.createdAt = this.createdAt;
      result.discountCode = this.discountCode;
      result.done = this.done;
      result.failedCount = this.failedCount;
      result.id = this.id;
      result.importedCount = this.importedCount;
      return result;
    }

    /**
     * The result of each code creation operation associated with the bulk creation
     * operation including any errors that might have occurred during the operation.
     */
    public Builder codes(DiscountRedeemCodeBulkCreationCodeConnection codes) {
      this.codes = codes;
      return this;
    }

    /**
     * The number of codes to create.
     */
    public Builder codesCount(int codesCount) {
      this.codesCount = codesCount;
      return this;
    }

    /**
     * The date and time when the bulk creation was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The code discount associated with the created codes.
     */
    public Builder discountCode(DiscountCodeNode discountCode) {
      this.discountCode = discountCode;
      return this;
    }

    /**
     * Whether the bulk creation is still queued (`false`) or has been run (`true`).
     */
    public Builder done(boolean done) {
      this.done = done;
      return this;
    }

    /**
     * The number of codes that weren't created successfully.
     */
    public Builder failedCount(int failedCount) {
      this.failedCount = failedCount;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The number of codes created successfully.
     */
    public Builder importedCount(int importedCount) {
      this.importedCount = importedCount;
      return this;
    }
  }
}
