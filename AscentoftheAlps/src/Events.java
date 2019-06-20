
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Taylor Conn I built dis with the guidence and psudocode of Aidan and
 * Jack
 */
//Aidan note
//it's not pseudocode taylor. I was working without knowledge of the variables or systems
//the only problem with it was not having the crew interactions or public static void calls, the popups and inventory interactions were fine

public class Events extends JPanel {

    static Random actOfGod = new Random();

    //Taylor made the switch statement architecture
    public static void runEvents() {
        int chance = actOfGod.nextInt(100) + 1;
        
        // switch statement on a random number, goto case and then break afterwards
        //program is frozen until event is complete
        switch (chance) {
            case (1):
                mutiny();
                AscentoftheAlps.outlogger.printf("Your party decided to mutiny and steal your elephants");
                break;
            case (2):
                break;
            case (3):
                break;
            case (4):
                scam_1();
                AscentoftheAlps.outlogger.printf("You came across nigerian prince scammer in the desert. Surprisingly he wasn't even nigerian");
                break;
            case (5):
                break;
            case (6):
                break;
            case (7):
                break;
            case (8):
                trade_2();
                AscentoftheAlps.outlogger.printf("You came across a trade opportunity (15 food for 1 medicine)");
                break;
            case (9):
                break;
            case (10):
                break;
            case (11):
                scam_2();
                AscentoftheAlps.outlogger.printf("You came across a suspicious merchant offering an exchange");
                break;
            case (12):
                break;
            case (13):
                break;
            case (14):
                trade_1();
                AscentoftheAlps.outlogger.printf("You came across a trade opportunity (20 food for 1 repairkit)");
                break;
            case (15):
                break;
            case (16):
                breakDown();
                AscentoftheAlps.outlogger.printf("Your supply cart axle snapped under the strain");
                break;
            case (17):
                break;
            case (18):
                break;
            case (19):
                eathuman();
                AscentoftheAlps.outlogger.printf("You came across a man alone in a field");
                break;
            case (20):
                break;
            case (21):
                break;
            case (22):
                break;
            case (23):
                breakDown();
                AscentoftheAlps.outlogger.printf("Your supply cart axle snapped under the strain");
                break;
            case (24):
                break;
            case (25):
                break;
            case (26):
                steal();
                AscentoftheAlps.outlogger.printf("You encountered a tribal campsite at nightfall");
                break;
            case (27):
                break;
            case (28):
                break;
            case (29):
                break;
            case (30):
                break;
            case (31):
                break;
            case (32):
                break;
            case (33):
                findAppleTree();
                AscentoftheAlps.outlogger.printf("You found an Apple tree, gaining 25 food");
                break;
            case (34):
                break;
            case (35):
                break;
            case (36):
                break;
            case (37):
                break;
            case (38):
                break;
            case (39):
                break;
            case (40):
                break;
            case (41):
                break;
            case (42):
                break;
            case (43):
                break;
            case (44):
                break;
            case (45):
                break;
            case (46):
                findAppleTree();
                AscentoftheAlps.outlogger.printf("You found an Apple tree, gaining 25 food");
                break;
            case (47):
                break;
            case (48):
                break;
            case (49):
                break;
            case (50):
                break;
            case (51):
                break;
            case (52):
                break;
            case (53):
                break;
            case (54):
                break;
            case (55):
                break;
            case (56):
                break;
            case (57):
                break;
            case (58):
                break;
            case (59):
                break;
            case (60):
                break;
            case (61):
                break;
            case (62):
                break;
            case (63):
                findFigTree();
                AscentoftheAlps.outlogger.printf("You found a fig tree, gaining 0 food");
                break;
            case (64):
                findAppleTree();
                AscentoftheAlps.outlogger.printf("You found an Apple tree, gaining 25 food");
                break;
            case (65):
                break;
            case (66):
                findPearTree();
                AscentoftheAlps.outlogger.printf("You found a pear tree, gaining 25 food");
                break;
            case (67):
                break;
            case (68):
                break;
            case (69):
                break;
            case (70):
                break;
            case (71):
                break;
            case (72):
                break;
            case (73):
                break;
            case (74):
                break;
            case (75):
                foodThief();
                AscentoftheAlps.outlogger.printf("A thief snuck into your camp and attempted to steal your food");
                break;
            case (76):
                break;
            case (77):
                break;
            case (78):
                dysentary();
                AscentoftheAlps.outlogger.printf("You contracted dysentry from George RR Martin's shitty writing");
                break;
            case (79):
                break;
            case (80):
                break;
            case (81):
                findAppleTree();
                AscentoftheAlps.outlogger.printf("You found an Apple tree, gaining 25 food");
                break;
            case (82):
                dysentary();
                AscentoftheAlps.outlogger.printf("You contracted dysentry from George RR Martin's shitty writing");
                break;
            case (83):
                break;
            case (84):
                findPearTree();
                AscentoftheAlps.outlogger.printf("You found a pear tree, gaining 25 food");
                break;
            case (85):
                protest();
                AscentoftheAlps.outlogger.printf("You came across a Free Tibet protest in your travels");
                break;
            case (86):
                break;
            case (87):
                foodThief();
                AscentoftheAlps.outlogger.printf("A thief snuck into your camp and attempted to steal your food");
                break;
            case (88):
                trade_3();
                AscentoftheAlps.outlogger.printf("You came across a trade opportunity (15 food for 1 medicine)");
                break;
            case (89):
                huntingTrip();
                AscentoftheAlps.outlogger.printf("In your travels you discovered a potential hunting ground");
                break;
            case (90):
                break;
            case (91):
                findFigTree();
                AscentoftheAlps.outlogger.printf("You found a fig tree, gaining 0 food");
                break;
            case (92):
                break;
            case (93):
                steal();
                AscentoftheAlps.outlogger.printf("You encountered a tribal campsite at nightfall");
                break;
            case (94):
                huntingTrip();
                AscentoftheAlps.outlogger.printf("In your travels you discovered a potential hunting ground");
                break;
            case (95):
                break;
            case (96):
                break;
            case (97):
                break;
            case (98):
                break;
            case (99):
                findPeachTree();
                AscentoftheAlps.outlogger.printf("You found a fig tree, gaining 30 food");
                break;
            case (100):
                break;
        }
    }

    //Taylor wrote the mutiny event
    //all of the chosen character stat modifyiers are reversed and you lose all your elephants
    public static void mutiny() {
        if (!PlayerStats.ab) {
            JOptionPane.showMessageDialog(null, "Your Crew Has Abandoned You And Have Taken All of your Elephants");
            PlayerStats.ab = true;
            Inventory.Elephants = 0.0;

            if (Var.hasChef) {
                Var.chefDie();
            }
            if (Var.hasDog) {
                Var.dogDie();
            }
            if (Var.hasElephantTamer) {
                Var.elephantTamerDie();
            }
            if (Var.hasHunter) {
                Var.hunterDie();
            }
            if (Var.hasMerchant) {
                Var.merchantDie();
            }
            if (Var.hasNavigator) {
                Var.navigatorDie();
            }
            if (Var.hasPreist) {
                Var.presitDie();
            }
        } else {
        }
    }

    //Aidan wrote the scam event
    //bad trade
    public static void scam_1() {
        int response = JOptionPane.showConfirmDialog(null, "A suspicious man offers you 200 food if you wire 50 food to the bank of nigeria to confirm the transaction. Take the deal?",
                null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.NO_OPTION:
                break;
            case JOptionPane.YES_OPTION:
                if (Inventory.foodSupply >= 50) {
                    Inventory.foodSupply = Inventory.foodSupply - 50;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "You did not have sufficient supplies");
                    break;
                }
            case JOptionPane.CLOSED_OPTION:
                break;
            default:
                break;
        }
    }

    // aidan here
    // bad trade
    public static void scam_2() {
        int response = JOptionPane.showConfirmDialog(null, "A happy merchant approaches and offers to trade 5 medicine for 30 food at 15% daily compounding interest. Do you accept?",
                null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.NO_OPTION:
                break;
            case JOptionPane.YES_OPTION:
                if (Inventory.foodSupply >= 30) {
                    Inventory.foodSupply = Inventory.foodSupply - 30;
                    Inventory.Medicine = Inventory.Medicine + 5;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "You did not have sufficient supplies");
                    break;
                }
            case JOptionPane.CLOSED_OPTION:
                break;

            default:
                break;
        }
    }

    // also here
    public static void trade_1() {
        int response = JOptionPane.showConfirmDialog(null, "You come across a friendly tribe offering trade. Trade 20 food for a repair kit?",
                null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.NO_OPTION:
                break;
            case JOptionPane.YES_OPTION:
                if (Inventory.foodSupply >= 20) {
                    Inventory.foodSupply = Inventory.foodSupply - 20;
                    Inventory.Repairkits = Inventory.Repairkits + 1;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "You did not have sufficient supplies");
                    break;
                }
            case JOptionPane.CLOSED_OPTION:
                break;

            default:
                break;
        }
    }

    //and here
    public static void trade_2() {
        int response = JOptionPane.showConfirmDialog(null, "You come across a friendly tribe offering trade. Trade 15 food for 1 medicine?",
                null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.NO_OPTION:
                break;
            case JOptionPane.YES_OPTION:
                if (Inventory.foodSupply >= 15) {
                    Inventory.foodSupply = Inventory.foodSupply - 15;
                    Inventory.Medicine = Inventory.Medicine + 1;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "You did not have sufficient supplies");
                    break;
                }
            case JOptionPane.CLOSED_OPTION:
                break;
            default:
                break;
        }
    }

    // and this one
    public static void trade_3() {
        int response = JOptionPane.showConfirmDialog(null, "You come across a friendly tribe offering trade. Trade 15 food for 1 medicine?",
                null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.NO_OPTION:
                break;
            case JOptionPane.YES_OPTION:
                if (Inventory.foodSupply >= 15) {
                    Inventory.foodSupply = Inventory.foodSupply - 15;
                    Inventory.Medicine = Inventory.Medicine + 1;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "You did not have sufficient supplies");
                    break;
                }
            case JOptionPane.CLOSED_OPTION:
                break;
            default:
                break;
        }
    }

    // Aidan did this event
    //get food
    public static void findAppleTree() {
        JOptionPane.showMessageDialog(null, "On your journey you discovered an apple tree. After some time spent picking you depart with 25 food");
        Inventory.foodSupply = Inventory.foodSupply + 25;
    }

    // and this one
    //get food
    public static void findPearTree() {
        JOptionPane.showMessageDialog(null, "On your journey you discovered a pear tree. After some time spent picking you depart with 25 food");
        Inventory.foodSupply = Inventory.foodSupply + 25;
    }

    // and this one
    //get no food
    public static void findFigTree() {
        JOptionPane.showMessageDialog(null, "On your journey you discovered a fig tree. After some time spent picking you depart without any food because figs are not food they are god’s idea of a joke");
        Inventory.foodSupply = Inventory.foodSupply + 0;
    }

    // and this one
    //get food
    public static void findPeachTree() {
        JOptionPane.showMessageDialog(null, "On your journey you discovered a peach tree. After some time spent picking you depart with 30 food");
        Inventory.foodSupply = Inventory.foodSupply + 30;
    }

    // and this one
    //Someone tries to steal from you and takes an elephant unless you have a dog
    public static void theifInTheNight() {
        JOptionPane.showMessageDialog(null, "While you were asleep, a thief snuck into your camp and attempted to steal one of your elephants!");
        if (Var.hasDog) {
            JOptionPane.showMessageDialog(null, " It’s a good thing you had a dog to keep watch!");
        } else {
            JOptionPane.showMessageDialog(null, "Because you had nobody to keep watch, you lost 1 elephant");
            Inventory.Elephants = Inventory.Elephants - 1;
        }
    }

    // and this one
    //You go hunting. Results depend on if you have a hunter and how many bullets you have
    public static void huntingTrip() {
        JOptionPane.showMessageDialog(null, "On your travels, you come across what looks like a potentially good hunting grounds.");
        if (Var.hasHunter && Inventory.Bullets >= 10) {
            JOptionPane.showMessageDialog(null, " Your hunter managed to bring back over 100 food. A successful diversion");
            Inventory.foodSupply = Inventory.foodSupply + 100;
            Inventory.Bullets = Inventory.Bullets - 10;
        } else if (Inventory.Bullets >= 15) {
            JOptionPane.showMessageDialog(null, " You only manage to catch small game, returning with 40 food");
            Inventory.foodSupply = Inventory.foodSupply + 40;
            Inventory.Bullets = Inventory.Bullets - 15;
        } else {
            JOptionPane.showMessageDialog(null, "You have an insufficient amount of bullets to hunt with any hope of catching anything");
        }
        //if you have a hunter and bullets, gain 100 food for 10 bullets else gain 40 food and waste 15 bullets
    }

    // and this one
    //Someone steals from you unless you have a dog
    public static void foodThief() {
        JOptionPane.showMessageDialog(null, "While you were asleep, a thief snuck into your camp and attempted to steal your food!");
        if (Var.hasDog) {
            JOptionPane.showMessageDialog(null, " It’s a good thing you had a dog to keep watch!");

        } else {
            JOptionPane.showMessageDialog(null, "Because you had nobody to keep watch, you lost 30 food");
            Inventory.foodSupply = Inventory.foodSupply - 30;
        }
    }

    // I also made this one
    // you choose wheater you wish to eat a friendly man
    public static void eathuman() {
        int response = JOptionPane.showConfirmDialog(null, "You come across a friendly man in an empty field. Do you wish to eat him?",
                null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "The old man gives you 1 medicine as a thank you for not eating him alive");
                Inventory.Medicine = Inventory.Medicine + 1;
                break;
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "You crunch down on the man's tibia, gaining 50 food but losing 1 health");
                Inventory.foodSupply = Inventory.foodSupply + 50;
                Var.health = Var.health - 1;
            case JOptionPane.CLOSED_OPTION:
                break;
            default:
                break;
        }
    }

    // and this one
    //you are presented with the option to steal from a rival tribe or not
    public static void steal() {
        int response = JOptionPane.showConfirmDialog(null, "As night falls, you come across a tribal campsite. Will you sneak in under darkness to try and steal supplies?",
                null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "You decide to pass up the opportunity. Instead, you spend the night getting a full night's rest. Gain 1 health");
                Var.health = Var.health + 1;
                break;
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "After successfully stealing some supplies, you awoke a tribal sentry and took an arrow to the back while escaping. Lose 1 health");
                Inventory.Bullets = Inventory.Bullets + 20;
                Inventory.Repairkits = Inventory.Repairkits + 1;
                Inventory.foodSupply = Inventory.foodSupply + 30;
                Var.health = Var.health - 1;
            case JOptionPane.CLOSED_OPTION:
                break;
            default:
                break;
        }
    }

    //Taylor if you have medicine your keep going like normal. Otherwise you lose one health
    public static void dysentary() {
        JOptionPane.showMessageDialog(null, "Due to drinking from a muddy puddle you have contracted dysentary");
        if (Inventory.Medicine >= 1) {
            Inventory.Medicine--;
            JOptionPane.showMessageDialog(null, "Luckily you have access to modern medicine so you continue on your journey");
        } else {
            Var.health--;
            JOptionPane.showMessageDialog(null, "You attempt the only cure you know which is performing a raindance. It is highly ineffective and you lose 1 health");
        }
    }

    //Taylor If you join the protest you get items added to your inventory. If you refuse you get dysentary
    public static void protest() {
        int response = JOptionPane.showConfirmDialog(null, "While travelling through a city you come across a protest. It looks like it's about to become a riot. Join in?",
                null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "You decide to pass up the opportunity and protesters throw mad at you. You contract dysentary");
                if (Inventory.Medicine >= 1) {
                    Inventory.Medicine--;
                    JOptionPane.showMessageDialog(null, "Luckily you have access to modern medicine so you continue on your journey");
                } else {
                    Var.health--;
                    JOptionPane.showMessageDialog(null, "You attempt the only cure you know which is performing a raindance. It is highly ineffective and you lose 1 health");
                    break;
                }
                break;
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "Your involvement changed the tide of the protest and the protesters show their graditude by replenishing your inventory");
                Inventory.Bullets = Inventory.Bullets + 20;
                Inventory.Repairkits = Inventory.Repairkits + 3;
                Inventory.foodSupply = Inventory.foodSupply + 30;
            case JOptionPane.CLOSED_OPTION:
                break;
            default:
                break;
        }
    }

    //Taylor This event slows down your progression unless you have a repair kit
    public static void breakDown() {
        JOptionPane.showMessageDialog(null, "Your inventory cart loses a wheel");
        if (Inventory.Repairkits >= 1) {
            Inventory.Repairkits--;
            JOptionPane.showMessageDialog(null, "You used a repair kit to fix the cart and you are back on your way");
        } else {
            Var.distancePerDay = Var.distancePerDay - 1;
            JOptionPane.showMessageDialog(null, "This slows down your daily progression by 1 km per day");
        }
    }
}
