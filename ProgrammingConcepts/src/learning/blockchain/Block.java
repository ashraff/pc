package learning.blockchain;

import java.util.Date;

public class Block {

	public String hash;

	public String previousHash;

	private String data; // our data will be a simple message.

	private long timeStamp; // as number of milliseconds since 1/1/1970.

	private int nonce;

	// Block Constructor.
	public Block(String data, String previousHash) {
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash(); // Making sure we do this after we set the other values.
	}

	public String calculateHash() {
		String calculatedhash = StringUtil.applySha256(previousHash + Long.toString(timeStamp) + data);
		return calculatedhash;
	}

	public void mineBlock(int difficulty) {
		String target = new String(new char[difficulty]).replace('\0', '0'); // Create a string with difficulty * "0"

		while (hash!=null && !hash.substring(0, difficulty).equals(target)) {
			setNonce(getNonce() + 1);
			hash = calculateHash();
		}

		System.out.println("Block Mined!!! : " + hash);
	}

	public int getNonce() {
		return nonce;
	}

	public void setNonce(int nonce) {
		this.nonce = nonce;
	}

}
