import java.lang.*;

class hollowButterfly
{
    public static void main(String args[])
    {
        int n = 5;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i == 1 || j == i || j == 1)
               {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            int space  = 2*(n-i);

            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                 if(i == 1 || j == i || j == 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(i == 1 || j == i || j == 1)
               {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            int space  = 2*(n-i);

            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                 if(i == 1 || j == i || j == 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}