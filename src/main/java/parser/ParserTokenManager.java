/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
package parser;
import java.io.Reader;
import java.io.StringReader;
import java.util.Scanner;

/** Token Manager. */
public class ParserTokenManager implements ParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x10L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x10L) != 0L)
            return jjStopAtPos(1, 4);
         break;
      default :
         return 2;
   }
   return 2;
}
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x7ffffffc0L) != 0L)
         {
            jjmatchedKind = 35;
            return 8;
         }
         if ((active0 & 0x4L) != 0L)
            return 1;
         return -1;
      case 1:
         if ((active0 & 0x7fdf7ffc0L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 1;
            return 8;
         }
         if ((active0 & 0x2080000L) != 0L)
            return 8;
         return -1;
      case 2:
         if ((active0 & 0x7f9f7fdc0L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 2;
            return 8;
         }
         if ((active0 & 0x4000200L) != 0L)
            return 8;
         return -1;
      case 3:
         if ((active0 & 0x3b9a7d900L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 3;
            return 8;
         }
         if ((active0 & 0x4405024c0L) != 0L)
            return 8;
         return -1;
      case 4:
         if ((active0 & 0x3a8a6c800L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 4;
            return 8;
         }
         if ((active0 & 0x11011100L) != 0L)
            return 8;
         return -1;
      case 5:
         if ((active0 & 0xa0840000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 5;
            return 8;
         }
         if ((active0 & 0x30822c800L) != 0L)
            return 8;
         return -1;
      case 6:
         if ((active0 & 0x80800000L) != 0L)
            return 8;
         if ((active0 & 0x20040000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 6;
            return 8;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 34:
         return jjStopAtPos(0, 38);
      case 39:
         return jjStopAtPos(0, 43);
      case 47:
         return jjMoveStringLiteralDfa1_0(0x4L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x20410080L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x2800000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x10a000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x100080200L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x200224900L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x41000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      default :
         return jjMoveNfa_0(6, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x4L) != 0L)
            return jjStopAtPos(1, 2);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x8800000L);
      case 102:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(1, 19, 8);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000180L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x200020000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x43200L);
      case 111:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(1, 25, 8);
         return jjMoveStringLiteralDfa2_0(active0, 0x64010440L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x4800L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x4080L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x1201040L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x20010400L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x180000000L);
      case 114:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(2, 26, 8);
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x540000L);
      case 116:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(2, 9, 8);
         return jjMoveStringLiteralDfa3_0(active0, 0x448008000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 122:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x10800000L);
      case 100:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(3, 6, 8);
         break;
      case 101:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 20, 8);
         else if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 8);
         return jjMoveStringLiteralDfa4_0(active0, 0x280008000L);
      case 103:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(3, 10, 8);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000L);
      case 109:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 8);
         break;
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 111:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 8);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 8);
         return jjMoveStringLiteralDfa4_0(active0, 0x100001000L);
      case 114:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 8);
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x20204000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000800L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x200800L);
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000L);
      case 101:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(4, 24, 8);
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x20004000L);
      case 107:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(4, 28, 8);
         break;
      case 110:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 8);
         break;
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x108008000L);
      case 116:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 8, 8);
         else if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 8);
         break;
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 99:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(5, 14, 8);
         break;
      case 100:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(5, 17, 8);
         break;
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000L);
      case 102:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(5, 33, 8);
         break;
      case 104:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(5, 21, 8);
         break;
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      case 110:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 15, 8);
         else if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(5, 27, 8);
         return jjMoveStringLiteralDfa6_0(active0, 0x20040000L);
      case 116:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(5, 11, 8);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(5, 32, 8);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
      case 102:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(6, 31, 8);
         break;
      case 116:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(6, 23, 8);
         break;
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(7, 18, 8);
         break;
      case 101:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(7, 29, 8);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 27;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 36)
                        kind = 36;
                     jjCheckNAddStates(0, 4);
                  }
                  else if ((0x100003600L & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                     jjCheckNAdd(0);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 36)
                        kind = 36;
                     jjCheckNAddStates(5, 8);
                  }
                  else if (curChar == 46)
                     jjCheckNAdd(10);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 1;
                  if (curChar == 48)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 0:
                  if ((0x100003600L & l) == 0L)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjCheckNAdd(0);
                  break;
               case 1:
                  if (curChar != 47)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddStates(9, 11);
                  break;
               case 2:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddStates(9, 11);
                  break;
               case 3:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 4:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 5:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 9:
                  if (curChar == 46)
                     jjCheckNAdd(10);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(10);
                  break;
               case 11:
                  if (curChar != 46)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(12);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(12);
                  break;
               case 13:
                  if (curChar == 48)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 14:
                  if (curChar != 48)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddStates(5, 8);
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddStates(12, 14);
                  break;
               case 19:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddStates(15, 17);
                  break;
               case 21:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddStates(0, 4);
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddStates(18, 20);
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(24, 25);
                  break;
               case 25:
                  if (curChar != 46)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(26);
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(26);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
               case 8:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAdd(8);
                  break;
               case 2:
                  if (kind > 5)
                     kind = 5;
                  jjAddStates(9, 11);
                  break;
               case 15:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(16);
                  break;
               case 16:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddStates(12, 14);
                  break;
               case 17:
               case 20:
               case 23:
                  if (curChar != 85)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(18);
                  break;
               case 18:
                  if (curChar == 76 && kind > 36)
                     kind = 36;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjAddStates(9, 11);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 27 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_4()
{
   switch(curChar)
   {
      case 39:
         return jjStopAtPos(0, 47);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa0_3()
{
   return jjMoveNfa_3(0, 0);
}
private int jjMoveNfa_3(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xffffff7fffffdbffL & l) != 0L && kind > 44)
                     kind = 44;
                  break;
               case 2:
                  if ((0xff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if ((0xff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
                  if ((0xff000000000000L & l) != 0L && kind > 45)
                     kind = 45;
                  break;
               case 5:
                  if (kind > 46)
                     kind = 46;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xffffffffefffffffL & l) != 0L)
                  {
                     if (kind > 44)
                        kind = 44;
                  }
                  else if (curChar == 92)
                     jjAddStates(21, 22);
                  break;
               case 1:
                  if (curChar == 92)
                     jjAddStates(21, 22);
                  break;
               case 5:
                  if (kind > 46)
                     kind = 46;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 44)
                     kind = 44;
                  break;
               case 5:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 46)
                     kind = 46;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjStopStringLiteralDfa_2(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_2(int pos, long active0)
{
   return jjMoveNfa_2(jjStopStringLiteralDfa_2(pos, active0), pos + 1);
}
private int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 34:
         return jjStopAtPos(0, 42);
      default :
         return jjMoveNfa_2(1, 0);
   }
}
private int jjMoveNfa_2(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if ((0xfffffffbffffdfffL & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((0xff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if ((0xff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
                  if ((0xff000000000000L & l) != 0L && kind > 40)
                     kind = 40;
                  break;
               case 5:
                  if (kind > 41)
                     kind = 41;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0xffffffffefffffffL & l) != 0L)
                  {
                     if (kind > 39)
                        kind = 39;
                     jjCheckNAdd(0);
                  }
                  else if (curChar == 92)
                     jjAddStates(21, 22);
                  break;
               case 0:
                  if ((0xffffffffefffffffL & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(0);
                  break;
               case 5:
                  if (kind > 41)
                     kind = 41;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(0);
                  break;
               case 5:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 41)
                     kind = 41;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   22, 23, 18, 24, 25, 15, 19, 20, 18, 2, 3, 5, 16, 17, 18, 19, 
   20, 18, 22, 23, 18, 2, 5, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\166\157\151\144", "\143\150\141\162", 
"\163\150\157\162\164", "\151\156\164", "\154\157\156\147", "\163\164\162\165\143\164", 
"\165\156\151\157\156", "\145\156\165\155", "\163\164\141\164\151\143", "\145\170\164\145\162\156", 
"\143\157\156\163\164", "\163\151\147\156\145\144", "\165\156\163\151\147\156\145\144", "\151\146", 
"\145\154\163\145", "\163\167\151\164\143\150", "\143\141\163\145", 
"\144\145\146\141\165\154\164", "\167\150\151\154\145", "\144\157", "\146\157\162", 
"\162\145\164\165\162\156", "\142\162\145\141\153", "\143\157\156\164\151\156\165\145", 
"\147\157\164\157", "\164\171\160\145\144\145\146", "\151\155\160\157\162\164", 
"\163\151\172\145\157\146", "\141\165\164\157", null, null, null, null, null, null, null, null, null, null, 
null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_BLOCK_COMMENT",
   "IN_STRING",
   "IN_CHARACTER",
   "CHARACTER_TERM",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, 1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2, -1, -1, -1, 0, 3, 4, 4, 4, 0, 
};
static final long[] jjtoToken = {
   0x843fffffffc1L, 
};
static final long[] jjtoSkip = {
   0x32L, 
};
static final long[] jjtoSpecial = {
   0x32L, 
};
static final long[] jjtoMore = {
   0x7bc00000000cL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[27];
private final int[] jjstateSet = new int[54];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public ParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 27; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 5 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 3)
         {
            jjmatchedKind = 3;
         }
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         break;
       case 3:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_3();
         break;
       case 4:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_4();
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        jjimageLen += jjmatchedPos + 1;
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
