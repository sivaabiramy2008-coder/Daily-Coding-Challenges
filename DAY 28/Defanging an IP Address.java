
class solution {
    public String defangIPaddr(String address) {
        address=" ";
        for(int i=0;i<address.length();i++){
            for(int j=0;j<address.length();j++){
               if(address.charAt(i) == '.') {
                   address = address.substring(0, i) + "[.]" + address.substring(i + 1);
                   i += 2; 
               }
            }
        }
        return address;
    }
}
