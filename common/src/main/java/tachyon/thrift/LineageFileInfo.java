/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tachyon.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-9-25")
public class LineageFileInfo implements org.apache.thrift.TBase<LineageFileInfo, LineageFileInfo._Fields>, java.io.Serializable, Cloneable, Comparable<LineageFileInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LineageFileInfo");

  private static final org.apache.thrift.protocol.TField M_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("mId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField M_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("mState", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField M_UNDER_FILE_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("mUnderFilePath", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LineageFileInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LineageFileInfoTupleSchemeFactory());
  }

  public long mId; // required
  public String mState; // required
  public String mUnderFilePath; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    M_ID((short)1, "mId"),
    M_STATE((short)2, "mState"),
    M_UNDER_FILE_PATH((short)3, "mUnderFilePath");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // M_ID
          return M_ID;
        case 2: // M_STATE
          return M_STATE;
        case 3: // M_UNDER_FILE_PATH
          return M_UNDER_FILE_PATH;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.M_ID, new org.apache.thrift.meta_data.FieldMetaData("mId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.M_STATE, new org.apache.thrift.meta_data.FieldMetaData("mState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.M_UNDER_FILE_PATH, new org.apache.thrift.meta_data.FieldMetaData("mUnderFilePath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LineageFileInfo.class, metaDataMap);
  }

  public LineageFileInfo() {
  }

  public LineageFileInfo(
    long mId,
    String mState,
    String mUnderFilePath)
  {
    this();
    this.mId = mId;
    setMIdIsSet(true);
    this.mState = mState;
    this.mUnderFilePath = mUnderFilePath;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LineageFileInfo(LineageFileInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.mId = other.mId;
    if (other.isSetMState()) {
      this.mState = other.mState;
    }
    if (other.isSetMUnderFilePath()) {
      this.mUnderFilePath = other.mUnderFilePath;
    }
  }

  public LineageFileInfo deepCopy() {
    return new LineageFileInfo(this);
  }

  @Override
  public void clear() {
    setMIdIsSet(false);
    this.mId = 0;
    this.mState = null;
    this.mUnderFilePath = null;
  }

  public long getMId() {
    return this.mId;
  }

  public LineageFileInfo setMId(long mId) {
    this.mId = mId;
    setMIdIsSet(true);
    return this;
  }

  public void unsetMId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MID_ISSET_ID);
  }

  /** Returns true if field mId is set (has been assigned a value) and false otherwise */
  public boolean isSetMId() {
    return EncodingUtils.testBit(__isset_bitfield, __MID_ISSET_ID);
  }

  public void setMIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MID_ISSET_ID, value);
  }

  public String getMState() {
    return this.mState;
  }

  public LineageFileInfo setMState(String mState) {
    this.mState = mState;
    return this;
  }

  public void unsetMState() {
    this.mState = null;
  }

  /** Returns true if field mState is set (has been assigned a value) and false otherwise */
  public boolean isSetMState() {
    return this.mState != null;
  }

  public void setMStateIsSet(boolean value) {
    if (!value) {
      this.mState = null;
    }
  }

  public String getMUnderFilePath() {
    return this.mUnderFilePath;
  }

  public LineageFileInfo setMUnderFilePath(String mUnderFilePath) {
    this.mUnderFilePath = mUnderFilePath;
    return this;
  }

  public void unsetMUnderFilePath() {
    this.mUnderFilePath = null;
  }

  /** Returns true if field mUnderFilePath is set (has been assigned a value) and false otherwise */
  public boolean isSetMUnderFilePath() {
    return this.mUnderFilePath != null;
  }

  public void setMUnderFilePathIsSet(boolean value) {
    if (!value) {
      this.mUnderFilePath = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case M_ID:
      if (value == null) {
        unsetMId();
      } else {
        setMId((Long)value);
      }
      break;

    case M_STATE:
      if (value == null) {
        unsetMState();
      } else {
        setMState((String)value);
      }
      break;

    case M_UNDER_FILE_PATH:
      if (value == null) {
        unsetMUnderFilePath();
      } else {
        setMUnderFilePath((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case M_ID:
      return Long.valueOf(getMId());

    case M_STATE:
      return getMState();

    case M_UNDER_FILE_PATH:
      return getMUnderFilePath();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case M_ID:
      return isSetMId();
    case M_STATE:
      return isSetMState();
    case M_UNDER_FILE_PATH:
      return isSetMUnderFilePath();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LineageFileInfo)
      return this.equals((LineageFileInfo)that);
    return false;
  }

  public boolean equals(LineageFileInfo that) {
    if (that == null)
      return false;

    boolean this_present_mId = true;
    boolean that_present_mId = true;
    if (this_present_mId || that_present_mId) {
      if (!(this_present_mId && that_present_mId))
        return false;
      if (this.mId != that.mId)
        return false;
    }

    boolean this_present_mState = true && this.isSetMState();
    boolean that_present_mState = true && that.isSetMState();
    if (this_present_mState || that_present_mState) {
      if (!(this_present_mState && that_present_mState))
        return false;
      if (!this.mState.equals(that.mState))
        return false;
    }

    boolean this_present_mUnderFilePath = true && this.isSetMUnderFilePath();
    boolean that_present_mUnderFilePath = true && that.isSetMUnderFilePath();
    if (this_present_mUnderFilePath || that_present_mUnderFilePath) {
      if (!(this_present_mUnderFilePath && that_present_mUnderFilePath))
        return false;
      if (!this.mUnderFilePath.equals(that.mUnderFilePath))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_mId = true;
    list.add(present_mId);
    if (present_mId)
      list.add(mId);

    boolean present_mState = true && (isSetMState());
    list.add(present_mState);
    if (present_mState)
      list.add(mState);

    boolean present_mUnderFilePath = true && (isSetMUnderFilePath());
    list.add(present_mUnderFilePath);
    if (present_mUnderFilePath)
      list.add(mUnderFilePath);

    return list.hashCode();
  }

  @Override
  public int compareTo(LineageFileInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMId()).compareTo(other.isSetMId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mId, other.mId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMState()).compareTo(other.isSetMState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mState, other.mState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMUnderFilePath()).compareTo(other.isSetMUnderFilePath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMUnderFilePath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mUnderFilePath, other.mUnderFilePath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LineageFileInfo(");
    boolean first = true;

    sb.append("mId:");
    sb.append(this.mId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("mState:");
    if (this.mState == null) {
      sb.append("null");
    } else {
      sb.append(this.mState);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mUnderFilePath:");
    if (this.mUnderFilePath == null) {
      sb.append("null");
    } else {
      sb.append(this.mUnderFilePath);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LineageFileInfoStandardSchemeFactory implements SchemeFactory {
    public LineageFileInfoStandardScheme getScheme() {
      return new LineageFileInfoStandardScheme();
    }
  }

  private static class LineageFileInfoStandardScheme extends StandardScheme<LineageFileInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LineageFileInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // M_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.mId = iprot.readI64();
              struct.setMIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // M_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mState = iprot.readString();
              struct.setMStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // M_UNDER_FILE_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mUnderFilePath = iprot.readString();
              struct.setMUnderFilePathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LineageFileInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(M_ID_FIELD_DESC);
      oprot.writeI64(struct.mId);
      oprot.writeFieldEnd();
      if (struct.mState != null) {
        oprot.writeFieldBegin(M_STATE_FIELD_DESC);
        oprot.writeString(struct.mState);
        oprot.writeFieldEnd();
      }
      if (struct.mUnderFilePath != null) {
        oprot.writeFieldBegin(M_UNDER_FILE_PATH_FIELD_DESC);
        oprot.writeString(struct.mUnderFilePath);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LineageFileInfoTupleSchemeFactory implements SchemeFactory {
    public LineageFileInfoTupleScheme getScheme() {
      return new LineageFileInfoTupleScheme();
    }
  }

  private static class LineageFileInfoTupleScheme extends TupleScheme<LineageFileInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LineageFileInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMId()) {
        optionals.set(0);
      }
      if (struct.isSetMState()) {
        optionals.set(1);
      }
      if (struct.isSetMUnderFilePath()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMId()) {
        oprot.writeI64(struct.mId);
      }
      if (struct.isSetMState()) {
        oprot.writeString(struct.mState);
      }
      if (struct.isSetMUnderFilePath()) {
        oprot.writeString(struct.mUnderFilePath);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LineageFileInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.mId = iprot.readI64();
        struct.setMIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.mState = iprot.readString();
        struct.setMStateIsSet(true);
      }
      if (incoming.get(2)) {
        struct.mUnderFilePath = iprot.readString();
        struct.setMUnderFilePathIsSet(true);
      }
    }
  }

}

