#include <iostream>
 
using namespace std;
 
void solve() {
    int a, b, c;
    cin >> a >> b >> c;
    
    // Check if any one number is the sum of the other two
    if (a + b == c || a + c == b || b + c == a) {
        cout << "YES
";
    } else {
        cout << "NO
";
    }
}
 
int main() {
    // Fast I/O optimization
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    
    return 0;
}