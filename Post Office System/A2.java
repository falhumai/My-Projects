/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.math.BigDecimal;

/**
 *
 * @author falhumai
 */
public class A2 {

    public static boolean dayEntry(String file, int day) {
        String currentFile = new String();
        try {
            currentFile = readFileToString(file);
        } catch (IOException e) {
            return false;
        }
        String logMessage = "- - DAY " + day + " OVER - -\n";
        currentFile = currentFile.concat(logMessage);
        return overwriteFile(currentFile, file);
    }

    public static boolean newLetterEntry(String file, String src, String dst) {
        String currentFile = new String();
        try {
            currentFile = readFileToString(file);
        } catch (IOException e) {
            return false;
        }
        String logMessage = "- New LETTER -\nSource: " + src + "\nDestination: " + dst + "\n";
        currentFile = currentFile.concat(logMessage);
        return overwriteFile(currentFile, file);
    }

    public static boolean newPackageEntry(String file, String src, String dst) {
        String currentFile = new String();
        try {
            currentFile = readFileToString(file);
        } catch (IOException e) {
            return false;
        }
        String logMessage = "- New PACKAGE -\nSource: " + src + "\nDestination: " + dst + "\n";
        currentFile = currentFile.concat(logMessage);
        return overwriteFile(currentFile, file);
    }

    public static boolean rejectedPackageEntry(String file, String src) {
        String currentFile = new String();
        try {
            currentFile = readFileToString(file);
        } catch (IOException e) {
            return false;
        }
        String logMessage = "- Rejected PACKAGE -\nSource: " + src + "\n";
        currentFile = currentFile.concat(logMessage);
        return overwriteFile(currentFile, file);
    }

    public static boolean rejectedLetterEntry(String file, String src) {
        String currentFile = new String();
        try {
            currentFile = readFileToString(file);
        } catch (IOException e) {
            return false;
        }
        String logMessage = "- Rejected LETTER -\nSource: " + src + "\n";
        currentFile = currentFile.concat(logMessage);
        return overwriteFile(currentFile, file);
    }

    public static boolean acceptedLetterEntry(String file, String dst) {
        String currentFile = new String();
        try {
            currentFile = readFileToString(file);
        } catch (IOException e) {
            return false;
        }
        String logMessage = "- Accepted LETTER -\nDestination: " + dst + "\n";
        currentFile = currentFile.concat(logMessage);
        return overwriteFile(currentFile, file);
    }

    public static boolean acceptedPackageEntry(String file, String dst) {
        String currentFile = new String();
        try {
            currentFile = readFileToString(file);
        } catch (IOException e) {
            return false;
        }
        String logMessage = "- Accepted PACKAGE -\nDestination: " + dst + "\n";
        currentFile = currentFile.concat(logMessage);
        return overwriteFile(currentFile, file);
    }

    public static boolean destroyedPackageEntry(String file, String where) {
        String currentFile = new String();
        try {
            currentFile = readFileToString(file);
        } catch (IOException e) {
            return false;
        }
        String logMessage = "- Incinerated PACKAGE -\nDestroyed at: " + where + "\n";
        currentFile = currentFile.concat(logMessage);
        return overwriteFile(currentFile, file);
    }

    public static boolean destroyedLetterEntry(String file, String where) {
        String currentFile = new String();
        try {
            currentFile = readFileToString(file);
        } catch (IOException e) {
            return false;
        }
        String logMessage = "- Incinerated LETTER -\nDestroyed at: " + where + "\n";
        currentFile = currentFile.concat(logMessage);
        return overwriteFile(currentFile, file);
    }

    public static boolean briberyDetectedEntry(String file, String where) {
        String currentFile = new String();
        try {
            currentFile = readFileToString(file);
        } catch (IOException e) {
            return false;
        }
        String logMessage = "- Something funny going on... -\nWhere did that extra money at " + where + " come from?\n";
        currentFile = currentFile.concat(logMessage);
        return overwriteFile(currentFile, file);
    }

    public static boolean itemCompleteEntry(String file, int daysTaken) {
        String currentFile = new String();
        try {
            currentFile = readFileToString(file);
        } catch (IOException e) {
            return false;
        }
        String logMessage = "- Delivery process complete -\nDelivery took " + daysTaken + " days.\n";
        currentFile = currentFile.concat(logMessage);
        return overwriteFile(currentFile, file);
    }

    public static boolean transitSentEntry(String file) {
        String currentFile = new String();
        try {
            currentFile = readFileToString(file);
        } catch (IOException e) {
            return false;
        }
        String logMessage = "- Standard transit departure -\n";
        currentFile = currentFile.concat(logMessage);
        return overwriteFile(currentFile, file);
    }

    public static boolean transitArrivedEntry(String file) {
        String currentFile = new String();
        try {
            currentFile = readFileToString(file);
        } catch (IOException e) {
            return false;
        }
        String logMessage = "- Standard transit arrival -\n";
        currentFile = currentFile.concat(logMessage);
        return overwriteFile(currentFile, file);
    }

    public static boolean criminalApperhendedEntry(String file, String criminal) {
        String currentFile = new String();
        try {
            currentFile = readFileToString(file);
        } catch (IOException e) {
            return false;
        }
        String logMessage = "---------------------------------------------------------Important Dope-Ass News------------------------------------------------------------------\n"
                + "\n"
                + "A freshly smoked up criminal whoz ass be a result of CMPT213-assignments-going-crazy has been detected.\n"
                + "\n"
                + "Da criminalz name is: " + criminal + "\n"
                + "\n"
                + "If you found his thugged-out ass somewhere please call tha five-o immediately (get yo'  ass  of  tha couch and call).\n"
                + "\n"
                + "Yo ass done been warned!!\n"
                + "\n"
                + "*Brought to you by Snoop-D-O-Double-G*\n"
                + "\n"
                + "--------------------------------------------------------------------------------------------------------------------------------------------------\n";

        currentFile = currentFile.concat(logMessage);
        return overwriteFile(currentFile, file);
    }

    public static ArrayList stringTokenizer(String inp) {
        ArrayList out = new ArrayList();
        for (int i = 0; i < inp.length(); ++i) {
            if (inp.charAt(i) != ' ' && inp.charAt(i) != '\n' && inp.charAt(i) != '\t' && inp.charAt(i) != '\0') {
                String tempStr = new String();
                int j = 0;
                for (j = i; j < inp.length() && inp.charAt(j) != ' ' && inp.charAt(j) != '\n' && inp.charAt(j) != '\t' && inp.charAt(j) != '\0';) {
                    tempStr = tempStr.concat(inp.charAt(j) + "");
                    ++j;
                    i = j;
                }
                out.add(tempStr);
                tempStr = "";
            }
        }
        return out;
    }

    public static boolean overwriteFile(String text, String dist) {
        try {
            FileWriter fout = new FileWriter(dist);
            fout.write(text);
            fout.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public static String readFileToString(String fileName) throws IOException {
        try (BufferedReader readBuffer = new BufferedReader(new FileReader(fileName))) {
            StringBuilder stringBuffer = new StringBuilder();
            String currentLine = readBuffer.readLine();

            while (currentLine != null) {
                stringBuffer.append(currentLine);
                stringBuffer.append("\n");
                currentLine = readBuffer.readLine();
            }
            String out = stringBuffer.toString();
            return out;
        }

    }

    public static boolean isOldCriminal(String file, String criminal) {
        try {
            ArrayList fileData = stringTokenizer(readFileToString(file));
            for (int i = 1; i < fileData.size(); ++i) {
                if (((String) fileData.get(i)).equals(criminal) == true) {
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            return false;
        }
    }

    public static boolean isNewCriminal(ArrayList newCriminalsArr, String criminal) {
        for (int i = 0; i < newCriminalsArr.size(); ++i) {
            if (((String) newCriminalsArr.get(i)).equals(criminal) == true) {
                return true;
            }
        }
        return false;
    }

    public static class Item {

        public String type;
        public String recipent;
        public String fromOffice;
        public String toOffice;
        public String returnRecipent;
        public int length;
        public int daysInTransit;
        public int daysSinceArraival;
        public int delivaryTime;
        public int funds;
        public int dayGotInSystem;

        public void fullCopy(Item other) {
            type = new String(other.type);
            recipent = new String(other.recipent);
            fromOffice = new String(other.fromOffice);
            toOffice = new String(other.toOffice);
            returnRecipent = new String(other.returnRecipent);
            length = other.length;
            daysInTransit = other.daysInTransit;
            daysSinceArraival = other.daysSinceArraival;
            delivaryTime = other.delivaryTime;
            funds = other.funds;
        }

        public Item() {
            type = new String();
            recipent = new String();
            fromOffice = new String();
            toOffice = new String();
            returnRecipent = "";
            length = 0;
            daysInTransit = 0;
            daysSinceArraival = 0;
            delivaryTime = 0;
            funds = 0;
            dayGotInSystem = 0;
        }
    }

    public static class Office {

        public ArrayList currentItems;
        public ArrayList waitingForSending;
        public String name;
        public int postagePrice;
        public int maxPackageSize;
        public int maxCap;
        public int persuationPrice;
        public int transitTime;

        public Office() {
            currentItems = new ArrayList();
            waitingForSending = new ArrayList();
            name = new String();
            postagePrice = 0;
            maxPackageSize = 0;
            maxCap = 0;
            persuationPrice = 0;
            transitTime = 0;
        }

        public void increaseStayingTimeForItems() {
            for (int i = 0; i < currentItems.size(); ++i) {
                ++((Item) currentItems.get(i)).daysSinceArraival;
            }
        }

        public void checkFor14DaysItems(Master m) {
            for (int i = 0; i < currentItems.size();) {
                if (((Item) currentItems.get(i)).daysSinceArraival == 13) {
                    if (((Item) currentItems.get(i)).type.equals("letter") == true
                            && ((Item) currentItems.get(i)).returnRecipent.equals("") == false) {
                        m.commandLETTER(new String(((Item) currentItems.get(i)).toOffice),
                                new String(((Item) currentItems.get(i)).returnRecipent), new String(((Item) currentItems.get(i)).fromOffice), "",
                                ((Item) currentItems.get(i)).dayGotInSystem);
                        currentItems.remove(i);
                        i = 0;
                    } else if (((Item) currentItems.get(i)).type.equals("package") == true
                            || (((Item) currentItems.get(i)).type.equals("letter") == true && ((Item) currentItems.get(i)).returnRecipent.equals("") == true)) {
                        if (((Item) currentItems.get(i)).type.equals("letter")) {
                            destroyedLetterEntry("log_" + name + ".txt", name);
                            destroyedLetterEntry("log_master.txt", name);
                        } else {
                            destroyedPackageEntry("log_" + name + ".txt", name);
                            destroyedPackageEntry("log_master.txt", name);
                        }
                        currentItems.remove(i);
                        i = 0;
                    }
                } else {
                    ++i;
                }
            }
        }

        public void sendItems(Master m) {
            for (int i = 0; i < waitingForSending.size(); ++i) {
                Item newItem = new Item();

                newItem.fullCopy((Item) waitingForSending.get(i));

                m.inTransit.add(newItem);
                transitSentEntry("log_" + name + ".txt");
            }
            waitingForSending.clear();
        }
    }

    public static class Master {

        public ArrayList inTransit;
        public ArrayList newCriminals;
        public ArrayList offices;
        public int currentDay;

        public Master() throws IOException {
            try {
                readFileToString("commands.txt");
            } catch (IOException e) {
                throw new IOException();
            }

            try {
                readFileToString("wanted.txt");
            } catch (IOException e) {
                throw new IOException();
            }

            ArrayList officesData;
            try {
                officesData = stringTokenizer(readFileToString("offices.txt"));
            } catch (IOException e) {
                throw new IOException();
            }
            currentDay = 0;
            inTransit = new ArrayList();
            newCriminals = new ArrayList();
            offices = new ArrayList();

            overwriteFile("", "log_master.txt");
            overwriteFile("", "log_front.txt");

            for (int i = 1; i < officesData.size();) {
                String officeName = (String) officesData.get(i);
                int transmiTime = (new BigDecimal((String) officesData.get(i + 1))).intValue();
                int requiredPostage = (new BigDecimal((String) officesData.get(i + 2))).intValue();
                int maxCap = (new BigDecimal((String) officesData.get(i + 3))).intValue();
                int persuationAmmount = (new BigDecimal((String) officesData.get(i + 4))).intValue();
                int maxPackageLen = (new BigDecimal((String) officesData.get(i + 5))).intValue();

                Office newOffice = new Office();
                newOffice.name = officeName;
                newOffice.transitTime = transmiTime;
                newOffice.postagePrice = requiredPostage;
                newOffice.maxCap = maxCap;
                newOffice.persuationPrice = persuationAmmount;
                newOffice.maxPackageSize = maxPackageLen;

                offices.add(newOffice);
                overwriteFile("", "log_" + officeName + ".txt");

                i = i + 6;
            }
        }

        public void updateWantedFile() {
            try {
                ArrayList wantedData = stringTokenizer(readFileToString("wanted.txt"));
                for (int i = 0; i < newCriminals.size(); ++i) {
                    String newCriminal = new String((String) newCriminals.get(i));
                    wantedData.add(newCriminal);
                }
                wantedData.set(0, (new BigDecimal(wantedData.size() - 1)).toString());
                String out = "";
                for (int i = 0; i < wantedData.size(); ++i) {
                    if (i < wantedData.size() - 1) {
                        out = out.concat((String) wantedData.get(i) + "\n");
                    } else {
                        out = out.concat((String) wantedData.get(i) + "\n");
                    }
                }
                overwriteFile(out, "wanted.txt");
            } catch (IOException e) {
                return;
            }
        }

        public void incrementDaysALL() {
            ++currentDay;
            for (int i = 0; i < inTransit.size(); ++i) {
                ++((Item) inTransit.get(i)).daysInTransit;
            }

            for (int i = 0; i < offices.size(); ++i) {
                ((Office) offices.get(i)).increaseStayingTimeForItems();
            }
        }

        public int getOfficeIndex(String name) {
            for (int i = 0; i < offices.size(); ++i) {
                if (((Office) offices.get(i)).name.equals(name)) {
                    return i;
                }
            }
            return -1;
        }

        public void deliverTransitItems() {
            for (int i = 0; i < inTransit.size();) {
                if (((Item) inTransit.get(i)).daysInTransit > ((Item) inTransit.get(i)).delivaryTime) {
                    transitArrivedEntry("log_" + ((Item) inTransit.get(i)).toOffice + ".txt");
                    int dstOfficeIndex = getOfficeIndex(((Item) inTransit.get(i)).toOffice);
                    if (((Office) offices.get(dstOfficeIndex)).currentItems.size() < ((Office) offices.get(dstOfficeIndex)).maxCap) {
                        if (((Item) inTransit.get(i)).type.equals("letter") == true) {
                            Item newItem = new Item();
                            newItem.fullCopy((Item) inTransit.get(i));
                            newItem.daysInTransit = 0;
                            newItem.daysSinceArraival = 0;
                            newItem.delivaryTime = ((Office) offices.get(dstOfficeIndex)).transitTime;
                            ((Office) offices.get(dstOfficeIndex)).currentItems.add(newItem);
                            inTransit.remove(i);
                        } else if (((Item) inTransit.get(i)).length <= ((Office) offices.get(dstOfficeIndex)).maxPackageSize) {
                            Item newItem = new Item();
                            newItem.fullCopy((Item) inTransit.get(i));
                            newItem.daysInTransit = 0;
                            newItem.daysSinceArraival = 0;
                            newItem.delivaryTime = ((Office) offices.get(dstOfficeIndex)).transitTime;
                            ((Office) offices.get(dstOfficeIndex)).currentItems.add(newItem);
                            inTransit.remove(i);
                        } else {
                            destroyedPackageEntry("log_" + ((Office) offices.get(dstOfficeIndex)).name + ".txt", ((Office) offices.get(dstOfficeIndex)).name);
                            destroyedPackageEntry("log_master.txt", ((Office) offices.get(dstOfficeIndex)).name);
                            inTransit.remove(i);
                        }
                    } else if (((Item) inTransit.get(i)).type.equals("letter") == true) {
                        destroyedLetterEntry("log_" + ((Office) offices.get(dstOfficeIndex)).name + ".txt", ((Office) offices.get(dstOfficeIndex)).name);
                        destroyedLetterEntry("log_master.txt", ((Office) offices.get(dstOfficeIndex)).name);
                        inTransit.remove(i);
                    } else {
                        destroyedPackageEntry("log_" + ((Office) offices.get(dstOfficeIndex)).name + ".txt", ((Office) offices.get(dstOfficeIndex)).name);
                        destroyedPackageEntry("log_master.txt", ((Office) offices.get(dstOfficeIndex)).name);
                        inTransit.remove(i);
                    }
                    i = 0;
                } else {
                    ++i;
                }
            }
        }

        public void commandDAY() {
            for (int i = 0; i < offices.size(); ++i) {
                ((Office) offices.get(i)).sendItems(this);
            }

            incrementDaysALL();
            dayEntry("log_master.txt", currentDay);
            for (int i = 0; i < offices.size(); ++i) {
                dayEntry("log_" + ((Office) offices.get(i)).name + ".txt", currentDay);
            }

            for (int i = 0; i < offices.size(); ++i) {
                ((Office) offices.get(i)).checkFor14DaysItems(this);
            }
            deliverTransitItems();
        }

        public void commandPICKUP(String postOffice, String pickUpPerson, Master m) {
            if (isOldCriminal("wanted.txt", pickUpPerson) == false && isNewCriminal(newCriminals, pickUpPerson) == false) {
                int postOfficeIndex = getOfficeIndex(postOffice);
                if (postOfficeIndex != -1) {
                    for (int i = 0; i < ((Office) offices.get(postOfficeIndex)).currentItems.size();) {
                        if (((Item) ((Office) offices.get(postOfficeIndex)).currentItems.get(i)).recipent.equals(pickUpPerson) == true) {
                            itemCompleteEntry("log_" + postOffice + ".txt", m.currentDay - ((Item) ((Office) offices.get(postOfficeIndex)).currentItems.get(i)).dayGotInSystem + 1);
                            ((Office) offices.get(postOfficeIndex)).currentItems.remove(i);
                            i = 0;
                        } else {
                            ++i;
                        }
                    }
                }
            } else {
                criminalApperhendedEntry("log_front.txt", pickUpPerson);
            }
        }

        public void commandLETTER(String srcPostOffice, String pickUpPerson, String dstPostOffice, String returnPerson, int systemTime) {
            int srcOfficeIndex = getOfficeIndex(srcPostOffice);
            if (srcOfficeIndex != -1) {
                newLetterEntry("log_" + srcPostOffice + ".txt", srcPostOffice, dstPostOffice);
                int dstOfficeIndex = getOfficeIndex(dstPostOffice);
                if (dstOfficeIndex != -1) {
                    if (isNewCriminal(newCriminals, pickUpPerson) == false
                            && isOldCriminal("wanted.txt", pickUpPerson) == false) {
                        if (((Office) offices.get(srcOfficeIndex)).currentItems.size()
                                < ((Office) offices.get(srcOfficeIndex)).maxCap) {
                            Item newItem = new Item();
                            newItem.fromOffice = new String(srcPostOffice);
                            newItem.recipent = new String(pickUpPerson);
                            newItem.toOffice = new String(dstPostOffice);
                            if (returnPerson.equals("NONE")) {
                                newItem.returnRecipent = "";
                            } else {
                                newItem.returnRecipent = new String(returnPerson);
                            }
                            newItem.dayGotInSystem = systemTime;
                            newItem.type = new String("letter");
                            newItem.delivaryTime = ((Office) offices.get(srcOfficeIndex)).transitTime;
                            ((Office) offices.get(srcOfficeIndex)).waitingForSending.add(newItem);
                            acceptedLetterEntry("log_" + srcPostOffice + ".txt", dstPostOffice);
                        } else {
                            rejectedLetterEntry("log_" + srcPostOffice + ".txt", srcPostOffice);
                            rejectedLetterEntry("log_master.txt", srcPostOffice);
                        }
                    } else {
                        rejectedLetterEntry("log_" + srcPostOffice + ".txt", srcPostOffice);
                        rejectedLetterEntry("log_master.txt", srcPostOffice);
                    }

                } else {
                    rejectedLetterEntry("log_" + srcPostOffice + ".txt", srcPostOffice);
                    rejectedLetterEntry("log_master.txt", srcPostOffice);
                }
            }
        }

        public void commandPACKAGE(String srcPostOffice, String pickUpPerson, String dstPostOffice, int funds, int packageLen) {
            int srcOfficeIndex = getOfficeIndex(srcPostOffice);
            if (srcOfficeIndex != -1) {
                newPackageEntry("log_" + srcPostOffice + ".txt", srcPostOffice, dstPostOffice);
                int dstOfficeIndex = getOfficeIndex(dstPostOffice);
                if (dstOfficeIndex != -1) {
                    if (isNewCriminal(newCriminals, pickUpPerson) == false
                            && isOldCriminal("wanted.txt", pickUpPerson) == false) {
                        if (((Office) offices.get(srcOfficeIndex)).currentItems.size()
                                < ((Office) offices.get(srcOfficeIndex)).maxCap) {
                            if (funds >= ((Office) offices.get(srcOfficeIndex)).postagePrice) {
                                if (packageLen <= ((Office) offices.get(srcOfficeIndex)).maxPackageSize) {
                                    if (packageLen <= ((Office) offices.get(dstOfficeIndex)).maxPackageSize) {
                                        // Clean insertion
                                        Item newItem = new Item();
                                        newItem.fromOffice = new String(srcPostOffice);
                                        newItem.recipent = new String(pickUpPerson);
                                        newItem.toOffice = new String(dstPostOffice);
                                        newItem.funds = funds;
                                        newItem.length = packageLen;
                                        newItem.type = new String("package");
                                        newItem.dayGotInSystem = currentDay;
                                        newItem.delivaryTime = ((Office) offices.get(srcOfficeIndex)).transitTime;
                                        ((Office) offices.get(srcOfficeIndex)).waitingForSending.add(newItem);
                                        acceptedPackageEntry("log_" + srcPostOffice + ".txt", dstPostOffice);
                                    } else {
                                        rejectedPackageEntry("log_" + srcPostOffice + ".txt", srcPostOffice);
                                        rejectedPackageEntry("log_master.txt", srcPostOffice);
                                    }
                                } else if (funds >= (((Office) offices.get(srcOfficeIndex)).postagePrice
                                        + ((Office) offices.get(srcOfficeIndex)).persuationPrice)) {
                                    // Illegal insertion
                                    Item newItem = new Item();
                                    newItem.fromOffice = new String(srcPostOffice);
                                    newItem.recipent = new String(pickUpPerson);
                                    newItem.toOffice = new String(dstPostOffice);
                                    newItem.funds = funds;
                                    newItem.length = packageLen;
                                    newItem.type = new String("package");
                                    newItem.dayGotInSystem = currentDay;
                                    newItem.delivaryTime = ((Office) offices.get(srcOfficeIndex)).transitTime;
                                    ((Office) offices.get(srcOfficeIndex)).waitingForSending.add(newItem);
                                    acceptedPackageEntry("log_" + srcPostOffice + ".txt", dstPostOffice);
                                    briberyDetectedEntry("log_master.txt", srcPostOffice);
                                } else {
                                    rejectedPackageEntry("log_" + srcPostOffice + ".txt", srcPostOffice);
                                    rejectedPackageEntry("log_master.txt", srcPostOffice);
                                }
                            } else {
                                rejectedPackageEntry("log_" + srcPostOffice + ".txt", srcPostOffice);
                                rejectedPackageEntry("log_master.txt", srcPostOffice);
                            }
                        } else {
                            rejectedPackageEntry("log_" + srcPostOffice + ".txt", srcPostOffice);
                            rejectedPackageEntry("log_master.txt", srcPostOffice);
                        }
                    } else {
                        rejectedPackageEntry("log_" + srcPostOffice + ".txt", srcPostOffice);
                        rejectedPackageEntry("log_master.txt", srcPostOffice);
                    }
                } else {
                    rejectedPackageEntry("log_" + srcPostOffice + ".txt", srcPostOffice);
                    rejectedPackageEntry("log_master.txt", srcPostOffice);
                }
            }
        }

        public void run() {
            try {
                ArrayList commandsData = stringTokenizer(readFileToString("commands.txt"));
                for (int i = 1; i < commandsData.size();) {
                    if (((String) commandsData.get(i)).equals("DAY") == true) {
                        commandDAY();
                        i = i + 1;
                    } else if (((String) commandsData.get(i)).equals("PICKUP") == true) {
                        String postOffice = new String(((String) commandsData.get(i + 1)));
                        String person = new String(((String) commandsData.get(i + 2)));
                        commandPICKUP(postOffice, person, this);
                        i = i + 3;
                    } else if (((String) commandsData.get(i)).equals("LETTER") == true) {
                        String postOffice = new String(((String) commandsData.get(i + 1)));
                        String pickUpPerson = new String(((String) commandsData.get(i + 2)));
                        String dst = new String(((String) commandsData.get(i + 3)));
                        String returnPerson = new String(((String) commandsData.get(i + 4)));
                        commandLETTER(postOffice, pickUpPerson, dst, returnPerson, currentDay);
                        i = i + 5;
                    } else if (((String) commandsData.get(i)).equals("PACKAGE") == true) {
                        String postOffice = new String(((String) commandsData.get(i + 1)));
                        String pickUpPerson = new String(((String) commandsData.get(i + 2)));
                        String dst = new String(((String) commandsData.get(i + 3)));
                        int fund = (new BigDecimal(new String(((String) commandsData.get(i + 4))))).intValue();
                        int length = (new BigDecimal(new String(((String) commandsData.get(i + 5))))).intValue();
                        commandPACKAGE(postOffice, pickUpPerson, dst, fund, length);
                        i = i + 6;
                    }
                }
            } catch (IOException e) {
                return;
            }
        }
    }

    /*
     * Main method.
     */
    public static void main(String[] args) {
        try {
            Master m = new Master();
            m.run();
        } catch (IOException e) {
            overwriteFile("Required files not found!!", "log_error.txt");
            return;
        }
    }
}