Date dIn = Date.parse("yyyy-MM-dd", payload.get('CloseDate'));

GregorianCalendar gcIn = new GregorianCalendar();
gcIn.setTime(dIn);
GregorianCalendar gcOut = new GregorianCalendar();
gcOut.setTime(dIn);
gcOut.add(Calendar.DAY_OF_YEAR, 30);

HashMap mapIn = new HashMap();
mapIn.put("year", gcIn.get(Calendar.YEAR));
mapIn.put("month", gcIn.get(Calendar.MONTH) + 1);
mapIn.put("day", gcIn.get(Calendar.DAY_OF_MONTH));

HashMap mapOut = new HashMap();
mapOut.put("year", gcOut.get(Calendar.YEAR));
mapOut.put("month", gcOut.get(Calendar.MONTH) + 1);
mapOut.put("day", gcOut.get(Calendar.DAY_OF_MONTH));

message.setSessionProperty("createdDate", mapIn);
message.setSessionProperty("dueDate", mapOut);

return payload;

